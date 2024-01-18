package L02_StacksAndQueues_Exercise.moreExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int element : array) {
            stack.push(element);
        }

        for (Integer e : stack) {
            System.out.print(e + " ");
        }
    }
}
