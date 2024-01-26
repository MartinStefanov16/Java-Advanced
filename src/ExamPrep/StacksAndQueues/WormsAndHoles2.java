package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class WormsAndHoles2 {
    public static void main(String[] args) {
        //https://judge.softuni.org/Contests/Practice/Index/4438#0
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> wormsStack = new ArrayDeque<>();
        ArrayDeque<Integer> holesQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(wormsStack::push);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(holesQueue::offer);

        int initialNumberOfWorms = wormsStack.size();
        int matches = 0;

        while (!holesQueue.isEmpty() && !wormsStack.isEmpty()) {
            int worm = wormsStack.peek();
            int hole = holesQueue.peek();

            if (worm == hole) {
                wormsStack.pop();
                holesQueue.poll();
                matches++;
            } else {
                holesQueue.poll();
                wormsStack.push(wormsStack.pop() - 3);
            }


            if (!wormsStack.isEmpty() && wormsStack.peek() <= 0) {
                wormsStack.pop();
            }

        }

        System.out.println();

        if (matches > 0) {
            System.out.printf("Matches: %d\n", matches);
        } else {
            System.out.println("There are no matches.");
        }

        if (wormsStack.isEmpty()) {

            if (initialNumberOfWorms == matches) {
                System.out.println("Every worm found a suitable hole!");
            } else {
                System.out.println("Worms left: none");
            }

        } else {
            //printRemainingWorms(wormsStack);
            System.out.println(wormsStack.toString().replaceAll("[\\[\\]]", ""));
        }

        if (holesQueue.isEmpty()) {
            System.out.println("Holes left: none");
        } else {
            printHoles(holesQueue);
        }




    }

    private static void printHoles(ArrayDeque<Integer> holesQueue) {
        System.out.print("Holes left: ");
        int size = holesQueue.size();

        for (int i = 1; i <= size; i++) {

            if (i != size){
                System.out.print(holesQueue.poll() + ", ");
            } else {
                System.out.print(holesQueue.poll());
            }

        }

    }

    private static void printRemainingWorms(ArrayDeque<Integer> wormsStack) {
        System.out.print("Worms left: ");
        int size = wormsStack.size();

        ArrayDeque<Integer> tempStack = new ArrayDeque<>();

        for (Integer worm : wormsStack) {
            tempStack.push(worm);
        }


        for (int i = 1; i <= size; i++) {

            if (i != size){
                System.out.print(tempStack.pop() + ", ");
            } else {
                System.out.println(tempStack.pop());
            }

        }
    }
}
