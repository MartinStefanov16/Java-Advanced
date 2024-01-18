package L09_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

import static java.lang.System.in;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .toList();

        Function<List<Integer>, Integer> getSum = listA -> {
          int sum = 0;
            for (Integer i : listA) {
                sum += i;
            }
            return sum;};

        System.out.println(getSum.apply(list));
    }
}
