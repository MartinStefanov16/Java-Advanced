package L02_StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] operators = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int n = operators[0];
        int s = operators[1];
        int x = operators[2];

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(numbers[i]);

        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else if (queue.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(queue));
        }
    }
}
