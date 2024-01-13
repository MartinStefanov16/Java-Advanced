package L05_SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class P03Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        //This problem is more easly solved with stacks and queues
        //Lecturer shows a way with Sets, using Iterators, which we have not learned about yet

        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0) {
            if (firstPlayer.isEmpty() || secondPlayer.isEmpty()){
                break;
            }

            Iterator<Integer> firstIterator = firstPlayer.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();

            Iterator<Integer> secondIterator = secondPlayer.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();


        }
    }
}
