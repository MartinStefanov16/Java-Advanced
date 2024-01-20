package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int yearGoal = Integer.parseInt(scanner.nextLine());
        int ivanAge = 18;

        for (int i = 1800; i <= yearGoal; i++) {

            if (i % 2 == 0) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= (12000 + (50 * ivanAge));
            }
            ivanAge++;
        }

        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
