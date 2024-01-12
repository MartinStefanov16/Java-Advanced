package L01_StacksAndQueues.ex02;

import java.util.*;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int n = numbers[0];
        int s = numbers[1];
        int x = numbers[2];

        int[] numbers2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            stack.push(numbers2[i]);
        }

        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }


    }
}
