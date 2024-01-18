package L02_StacksAndQueues_Exercise.moreExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        String[] tokens = scanner.nextLine().split(" ");

        int elementsToPush = Integer.parseInt(tokens[0]);
        int elementsToPop = Integer.parseInt(tokens[1]);
        int elementToCheck = Integer.parseInt(tokens[2]);

        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();



        for (int i = 0; i < elementsToPush; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }

        if (stack.contains(elementToCheck)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(stack));
        }

    }
}
