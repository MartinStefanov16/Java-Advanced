package L05_SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class P04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();


        Map<Double, Integer> numsWithOccurances = new LinkedHashMap<>();

        for (double num : nums) {

            if (!numsWithOccurances.containsKey(num)) {
                numsWithOccurances.put(num, 1);
            } else {
                int currentCount = numsWithOccurances.get(num);
                numsWithOccurances.put(num, currentCount + 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : numsWithOccurances.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());

        }

    }
}
