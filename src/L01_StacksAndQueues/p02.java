package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int number = Integer.parseInt(scanner.nextLine());

        while (number != 0) {
            int tempNum = number % 2;
            stack.push(tempNum);

            number /= 2;


        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());


        }
    }
}
