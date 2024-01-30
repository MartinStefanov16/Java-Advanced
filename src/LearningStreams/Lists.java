package LearningStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

//        list = list.stream()
//                //.filter(e -> e % 2 == 0)
//                .sorted((n1, n2) -> n1.compareTo(n2))
//                 .collect(Collectors.toList());

//        list = list.stream()
//                .sorted((n1, n2) -> n1.compareTo(n2))
//                 .collect(Collectors.toList());

        //list.forEach(e -> System.out.print(e));

        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));






    }
}
