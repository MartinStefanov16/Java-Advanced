package L06_SetsAndMapsAdvanced_Excercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class P01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> names = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String currentName = scanner.nextLine();
            names.add(currentName);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}
