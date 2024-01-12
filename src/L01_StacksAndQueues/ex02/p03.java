package L01_StacksAndQueues.ex02;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int[] commandParts = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int command = commandParts[0];

            switch (command) {
                case 1:
                    stack.push(commandParts[1]);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(Collections.max(stack));
                    break;
            }

        }


    }
}
