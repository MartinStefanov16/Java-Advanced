package temp;

import java.util.Scanner;

public class tank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int volumePool = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hoursWorkerMiss = Double.parseDouble(scanner.nextLine());

        double pipeDebit = pipe1 * hoursWorkerMiss;
        double pipeDebit2 = pipe2 * hoursWorkerMiss;
        double volumePool2 = pipeDebit + pipeDebit2;
        double fillPool = volumePool2 / volumePool * 100;

//        if (volumeFilled <= maxPoolVolume) {
//            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", (volumeFilled / maxPoolVolume) * 100, (filledFromPipe1 / volumeFilled)*100,(filledFromPipe2 / volumeFilled)*100);
//        } else {
//            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursUnattended, volumeFilled - maxPoolVolume);
//        }

        if (volumePool2 <= volumePool) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%% . Pipe 2: %.2f %% .", (volumePool2 / volumePool) *100,
                    (pipeDebit / volumePool2) * 100, (pipeDebit2 / volumePool2) * 100);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursWorkerMiss, (volumePool2 - volumePool));
        }
    }
}
