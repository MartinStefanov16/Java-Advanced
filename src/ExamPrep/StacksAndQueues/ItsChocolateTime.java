package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class ItsChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Double> milkQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .forEach(milkQueue::offer);

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .forEach(cacaoStack::push);

        int bakingChoco = 0;
        int darkChoco = 0;
        int milkChoco = 0;

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()){
            double milk = milkQueue.poll();
            double cacao = cacaoStack.pop();
            double cacaoPercentage = Math.ceil(cacao / (milk + cacao) * 100);

            if (cacaoPercentage == 30){
                milkChoco++;
            } else if (cacaoPercentage == 50){
                darkChoco++;
            } else if (cacaoPercentage == 100){
                bakingChoco++;
            } else {
                milk += 10;
                milkQueue.offer(milk);

            }

        }

        if (milkChoco > 0 && darkChoco > 0 && bakingChoco > 0){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        //int bakingChoco = 0;
        //        int darkChoco = 0;
        //        int milkChoco = 0;

        if (bakingChoco > 0){
            printChoco(bakingChoco, "Baking Chocolate");
        }
        if (darkChoco > 0){
            printChoco(darkChoco, "Dark Chocolate");
        }
        if (milkChoco > 0){
            printChoco(milkChoco, "Milk Chocolate");
        }






    }

    private static void printChoco(int amount, String choco) {
        System.out.printf("# %s --> %d\n",choco, amount);

    }
}
