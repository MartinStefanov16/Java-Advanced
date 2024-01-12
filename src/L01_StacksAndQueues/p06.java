package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] names = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String name : names) {
            stack.offer(name);
        }

        while (stack.size() > 1) {
            for (int i = 1; i < n; i++) {
                stack.offer(stack.poll());

            }
            System.out.println("Removed " + stack.poll());
        }
        System.out.println("Last is " + stack.poll());


    }
}
