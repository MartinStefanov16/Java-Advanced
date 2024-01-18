package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String stayingAt = "";
        String country = "";
        double price = 0.0;

        if (budget <= 1000) {
            stayingAt = "Camp";

            switch (season) {
                case "Summer":
                    price = budget * 0.65;
                    country = "Alaska";
                    break;
                case "Winter":
                    price = budget * 0.45;
                    country = "Morocco";
                    break;
            }

        } else if (budget > 1000 && budget <= 3000) {
            stayingAt = "Hut";
            switch (season) {
                case "Summer":
                    price = budget * 0.80;
                    country = "Alaska";
                    break;
                case "Winter":
                    price = budget * 0.60;
                    country = "Morocco";
                    break;
            }

        } else {
            stayingAt = "Hotel";
            price = budget * 0.90;
            switch (season) {
                case "Summer":
                    country = "Alaska";
                    break;
                case "Winter":
                    country = "Morocco";
                    break;
            }

        }

        System.out.printf("%s - %s - %.2f", country, stayingAt, price);

    }
}
