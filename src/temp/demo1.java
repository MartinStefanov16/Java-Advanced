package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int number = 0;

        // number > 10
        // STOP

        while (number < 10){
            number++;

            String input = scanner.nextLine();

                    if (input.equals("STOP")) {
                        /// asas
                        break;
                    }

        }
        //---------------------------
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int num = Integer.parseInt(input);
            number += num;

            if (number > 10) {
                break;
            }

            input = scanner.nextLine();
        }


    }
}
