package Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> moneyStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(moneyStack::push);

        ArrayDeque<Integer> foodPricesQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(foodPricesQueue::offer);

        int foodEaten = 0;

        while (!moneyStack.isEmpty() && !foodPricesQueue.isEmpty()){
            int money = moneyStack.pop();
            int price = foodPricesQueue.poll();

            if (money == price){
                foodEaten++;

            } else if (money > price) {
                foodEaten++;
                int change = money - price;
                int nextMoney = 0;
                if (!moneyStack.isEmpty()){
                    nextMoney = moneyStack.pop();
                }




                moneyStack.push(change + nextMoney);
            }
        }

        if (foodEaten == 0) {
            System.out.println("Henry remained hungry. He will try next weekend again.");
        } else if (foodEaten >= 4){
            System.out.printf("Gluttony of the day! Henry ate %d foods.", foodEaten);
        } else if (foodEaten == 1){
            System.out.printf("Henry ate: %d food.", foodEaten);
        } else {
            System.out.printf("Henry ate: %d foods.", foodEaten);
        }









    }
}
