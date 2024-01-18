package L09_FunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        list.forEach(e -> System.out.print(e + " "));
        Collections.sort(list);
        System.out.println();
        list.forEach(e -> System.out.print(e + " "));
    }
}
