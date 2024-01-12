package L02_StacksAndQueues_Exercise;

import java.util.*;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] operators = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = operators[0];
        int s = operators[1];
        int x = operators[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.contains(x)) {
            System.out.println("true");
        } else if (stack.isEmpty()) {
            System.out.println("0");

        } else {
            System.out.println(Collections.min(stack));
        }







    }
}
