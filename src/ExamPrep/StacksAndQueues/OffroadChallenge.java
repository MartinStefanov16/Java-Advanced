package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class OffroadChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> initialFuel = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(initialFuel::push);

        ArrayDeque<Integer> additionalConsumptionIndex = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(additionalConsumptionIndex::offer);

        ArrayDeque<Integer> amountOfFuelNeeded = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(amountOfFuelNeeded::offer);

        ArrayDeque<String> altitudes = new ArrayDeque<>();
        int altitudeReached = 0;
        int altitudeGoal = initialFuel.size();

        boolean topReached = false;

        while (altitudeReached < altitudeGoal){
            int fuel = initialFuel.peek();
            int fuelConsumption = additionalConsumptionIndex.peek();
            int fuelNeeded = amountOfFuelNeeded.peek();

            if (fuel - fuelConsumption >= fuelNeeded){
                initialFuel.pop();
                additionalConsumptionIndex.poll();
                amountOfFuelNeeded.poll();
                System.out.printf("John has reached: Altitude %d\n", ++altitudeReached);
                altitudes.offer("Altitude " + String.valueOf(altitudeReached));

            } else {
                System.out.printf("John did not reach: Altitude %d\n", altitudeReached + 1);
                break;
            }




        }

        if (altitudeReached == altitudeGoal) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        } else {
            if (altitudeReached > 0){
                // reached some
                System.out.println("John failed to reach the top.");
                System.out.print("Reached altitudes: ");
                System.out.println(altitudes.toString().replaceAll("[\\[\\]]", ""));

            } else {
                System.out.println("John failed to reach the top.");
                System.out.println("John didn't reach any altitude.");

            }
        }

    }
}
