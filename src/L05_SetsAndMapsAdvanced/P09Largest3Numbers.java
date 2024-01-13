package L05_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P09Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        if (sorted.size() < 3) {
            for (Integer n : sorted) {
                System.out.print(n + " ");
            }
        } else {
            int i = 0;
                for (Integer n : sorted) {
                    System.out.print(n + " ");
                    i++;
                    if (i >= 3) {
                        return;
                    }
                }
            }

    }
}
