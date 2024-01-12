package L01_StacksAndQueues.ex02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] commands = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int n = commands[0];
        int s = commands[1];
        int x = commands[2];

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
