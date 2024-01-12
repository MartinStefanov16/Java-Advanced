package L01_StacksAndQueues.ex02;

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

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (Integer n : numbers) {
            stack.push(n);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
