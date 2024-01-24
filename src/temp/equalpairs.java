package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class equalpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        int previusPairValue = 0;
        int maxDiff = 0;

        boolean differenceFound = false;

        for (int i = 0; i < n; i++) {
            int numberOne = Integer.parseInt(scanner.nextLine());
            int numberTwo = Integer.parseInt(scanner.nextLine());
            int currentSum = numberOne + numberTwo;

            if (i == 0) {
                previusPairValue = currentSum;
                continue;
            }

            if (previusPairValue != currentSum) {
                differenceFound =  true;

                if (previusPairValue > currentSum) {
                    maxDiff = previusPairValue - currentSum;
                } else {
                    maxDiff = currentSum - previusPairValue;
                }
            }
            previusPairValue = currentSum;
        }

        if (differenceFound) {
            System.out.printf("No, maxdiff=%d", maxDiff);
        } else {
            System.out.printf("Yes, value=%d", previusPairValue);
        }
    }
}
