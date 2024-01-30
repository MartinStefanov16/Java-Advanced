package LearningStreams;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Sets {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

//        set = set.stream().filter(e -> e % 2 == 0)
//                .collect(Collectors.toSet());

//        set = set.stream().sorted((n1, n2) -> n1.compareTo(n2))
//                        .collect(Collectors.toSet());

        boolean has = set.stream().collect(Collectors.toList()).contains(1);

        System.out.println(has);
        System.out.println(set.toString());
    }
}
