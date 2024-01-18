package temp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class lmao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
