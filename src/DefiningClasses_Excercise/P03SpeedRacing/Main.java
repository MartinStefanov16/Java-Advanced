package DefiningClasses_Excercise.P03SpeedRacing;

import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = (scanner.nextLine().split("\\s+"));
            String model = input[0];
            double fuelAmount = Double.parseDouble(input[1]);
            double fuelCostPerKM = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerKM);
            cars.put(model, car);

        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String carToDrive = input.split("\\s+")[1];
            int kilometersToDrive = Integer.parseInt(input.split("\\s+")[2]);

            cars.get(carToDrive).drive(kilometersToDrive);
            //Car.drive(carToDrive,kilometersToDrive);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Car> stringCarEntry : cars.entrySet()) {
            System.out.println(stringCarEntry.getValue());

        }


    }
}
