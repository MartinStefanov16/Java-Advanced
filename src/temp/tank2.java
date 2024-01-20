package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class tank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int maxPoolVolume = Integer.parseInt(scanner.nextLine());
        int pipe1Capacity = Integer.parseInt(scanner.nextLine());
        int pipe2Capacity = Integer.parseInt(scanner.nextLine());
        double hoursUnattended = Double.parseDouble(scanner.nextLine());

        double filledFromPipe1 = pipe1Capacity * hoursUnattended;
        double filledFromPipe2 = pipe2Capacity * hoursUnattended;

        double volumeFilled = filledFromPipe1 + filledFromPipe2;

        if (volumeFilled <= maxPoolVolume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (volumeFilled / maxPoolVolume) * 100, (filledFromPipe1 / volumeFilled)*100,(filledFromPipe2 / volumeFilled)*100);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursUnattended, volumeFilled - maxPoolVolume);
        }


    }
}
