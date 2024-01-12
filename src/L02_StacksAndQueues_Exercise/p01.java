package L02_StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        ArrayDeque<Integer> stackOfInteger = new ArrayDeque<>();

        for (int n : numbers) {
            stackOfInteger.push(n);
        }

        for (int num : stackOfInteger) {
            System.out.print(stackOfInteger.pop() + " ");
        }


    }
}
