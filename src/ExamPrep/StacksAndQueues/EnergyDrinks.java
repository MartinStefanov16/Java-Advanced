package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        ArrayDeque<Integer> caffeineStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(caffeineStack::push);

        ArrayDeque<Integer> energyDrinksQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(energyDrinksQueue::offer);

        int caffeineTaken = 0;

        while (!caffeineStack.isEmpty() && !energyDrinksQueue.isEmpty()){
            int coffeine = caffeineStack.pop();
            int energyDrink = energyDrinksQueue.poll();
            int sum = coffeine * energyDrink;

            if (sum + caffeineTaken <= 300){
                caffeineTaken += sum;
            } else {
                energyDrinksQueue.offer(energyDrink);
                caffeineTaken -= 30;
            }

            if (caffeineTaken < 0){
                caffeineTaken = 0;
            }

        }

        if (!energyDrinksQueue.isEmpty()){
            System.out.print("Drinks left: ");
            System.out.println(energyDrinksQueue.toString().replaceAll("[\\[\\]]", ""));
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }

        System.out.printf("Stamat is going to sleep with %d mg caffeine.", caffeineTaken);

    }
}
