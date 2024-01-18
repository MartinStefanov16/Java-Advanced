package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double lengthStart = Double.parseDouble(scanner.nextLine());
        double heightStart = Double.parseDouble(scanner.nextLine());

        double lengthEnd = Double.parseDouble(scanner.nextLine());
        double heightEnd = Double.parseDouble(scanner.nextLine());

        double coordLong = Double.parseDouble(scanner.nextLine());
        double coordHigh = Double.parseDouble(scanner.nextLine());

        if (coordHigh == heightStart && coordLong >= lengthStart && coordLong <= lengthEnd) {
            // top border
            System.out.println("Border");
        } else if (coordHigh == heightEnd && coordLong >= lengthStart && coordLong <= lengthEnd) {
            // bottom border
            System.out.println("Border");
        } else if (coordLong == lengthStart && coordHigh >= heightStart && coordHigh <= heightEnd) {
            //left border
            System.out.println("Border");
        } else if ((coordLong == lengthEnd && coordHigh >= heightStart && coordHigh <= heightEnd)) {
            //right border
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }


    }
}
