package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class multiplyByTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double number = Double.parseDouble(scanner.nextLine());

        while (number >= 0) {
            System.out.printf("Result: %.2f\n", number * 2);
            number = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
