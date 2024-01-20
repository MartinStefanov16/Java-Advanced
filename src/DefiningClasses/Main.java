package DefiningClasses;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            Car myCar = new Car();

            myCar.setBrand(carInfo[0]);
            myCar.setModel(carInfo[1]);
            myCar.setHorsepower(Integer.parseInt(carInfo[2]));

            System.out.println(myCar);
        }








    }
}
