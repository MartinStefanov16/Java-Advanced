package temp;

import java.util.Scanner;

import static java.lang.System.in;

public class RentalCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";

        // summer, winter
        // cabrio, jeep
        double price = 0.0;

        if (budget <= 100) {
            carClass = "Economy class";

            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    price = budget * 0.35;
                    break;
                case "Winter":
                    carType = "Jeep";
                    price = budget * 0.65;
                    break;
            }

        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            switch (season) {
                case "Summer":
                    carType = "Cabrio";
                    price = budget * 0.45;
                    break;
                case "Winter":
                    carType = "Jeep";
                    price = budget * 0.80;
                    break;
            }


        } else {
            // > 500
            carClass = "Luxury class";
            carType = "Jeep";
            price = budget * 0.90;

        }



        //print
        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, price);

    }
}
