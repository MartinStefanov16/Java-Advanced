package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] input = scanner.nextLine().split(" ");

        for (String element : input) {
            stack.offer(element);
        }

        int number = 0;

        boolean firstIteration = true;

        while (stack.size() > 1) {
            int firstNum = 0;

            if (firstIteration) {
                firstNum = Integer.parseInt(stack.poll());
                firstIteration = false;
            } else {
                firstNum = number;
            }




            String operator = stack.poll();
            int secondNum = Integer.parseInt(stack.poll());

            switch (operator) {
                case "+":
                    number = firstNum + secondNum;
                break;
                case "-":
                    number = firstNum - secondNum;
                break;
            }


        }

        System.out.println(number);


    }
}
