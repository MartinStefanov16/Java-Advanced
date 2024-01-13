package L05_SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

import static java.lang.System.in;

public class P01ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        HashSet<String> carNumbers = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split(", ");
            String command = tokens[0];
            String carLicense = tokens[1];

            switch (command){
                case "IN":
                    carNumbers.add(carLicense);
                    break;
                case "OUT":
                    carNumbers.remove(carLicense);
                    break;
            }

            input = scanner.nextLine();
        }

        if (carNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : carNumbers) {
                System.out.println(carNumber);
            }
        }


    }
}
