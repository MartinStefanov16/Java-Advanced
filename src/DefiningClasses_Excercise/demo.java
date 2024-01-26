package DefiningClasses_Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(1);

        list.stream()
                .filter(n -> n % 2 ==0)
                .sorted((n1,n2) -> n1.compareTo(n2))
                .forEach(n -> System.out.println(n));




    }
}
