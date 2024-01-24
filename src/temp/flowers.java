package temp;

import java.util.Scanner;

public class flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qChri = Integer.parseInt(scanner.nextLine());
        int qRose = Integer.parseInt(scanner.nextLine());
        int qTubo = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String weekend = scanner.nextLine();

        double sum = 0;


        switch (season) {
            case "Spring":
            case "Summer":
                sum = qChri * 2 + qRose * 4.1 + qTubo * 2.5;
                break;

            case "Аutumn":
            case "Winter":
                sum = qChri * 3.75 + qRose * 4.5 + qTubo * 4.15;

                break;

        }

        if (weekend.equals("Y")) {
            sum = sum * 1.15;
        }
        if (qTubo > 7 && season.equals("Spring")) {
            sum = sum * 0.95;
        }
        if (qRose >= 10 && season.equals("Winter")) {
            sum = sum * 0.9;
        }
        if (qChri + qRose + qTubo > 20) {
            sum = 0.8 * sum;
        }

        sum = sum + 2;

        System.out.printf("%.2f", sum);
    }
}
