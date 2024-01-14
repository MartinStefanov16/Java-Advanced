package L06_SetsAndMapsAdvanced_Excercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.in;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] size = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(size[0]);
        int secondSetSize = Integer.parseInt(size[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        Set<Integer> repeatingElements = new LinkedHashSet<>();

//        for (Integer e : firstSet) {
//            if (secondSet.contains(e)) {
//                repeatingElements.add(e);
//            }
//        }

        firstSet.retainAll(secondSet);

        for (Integer element : firstSet) {
            System.out.print(element + " ");
        }


    }
}
