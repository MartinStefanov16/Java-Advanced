package L01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("print")) {

            if (input.equals("cancel")) {
                if (printerQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s\n", printerQueue.poll());

                }
            } else {
                printerQueue.offer(input);
            }




            input = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
