package L06_SetsAndMapsAdvanced_Excercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.in;

public class P03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> table = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split("\\s+");
            for (String element : elements) {
                table.add(element);

            }
        }

        for (String element : table) {
            System.out.print(element + " ");

        }

    }
}
