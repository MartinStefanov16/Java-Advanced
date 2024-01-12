package L02_StacksAndQueues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split("");



        if (input.length % 2 != 0) {
            System.out.println("NO");
            return;
        }



        //queue
        ArrayDeque<String> leftSide = new ArrayDeque<>();
        //stack
        ArrayDeque<String> rightSide = new ArrayDeque<>();

        for (int i = 0; i < input.length / 2; i++) {
            leftSide.offer(input[i]);
        }
        for (int i = input.length / 2; i < input.length; i++) {
            rightSide.push(input[i]);
        }

        boolean imbalanceFound = false;

        for (String element : leftSide) {
            String leftElement = leftSide.poll();
            String rightElement = rightSide.pop();

            switch (leftElement) {
                case ")":
                case "]":
                case "}":
                    imbalanceFound = true;
                    break;
                case "{":
                    if (!rightElement.equals("}")) {
                        imbalanceFound = true;
                    }
                    break;
                case "[":
                    if (!rightElement.equals("]")) {
                        imbalanceFound = true;
                    }
                    break;
                case "(":
                    if (!rightElement.equals(")")) {
                        imbalanceFound = true;
                    }
                    break;
            }

            if (imbalanceFound) {
                break;
            }

        }

        if (imbalanceFound) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }






    }
}
