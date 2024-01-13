package L05_SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();


        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);

        for (Integer e : hashSet) {
            System.out.println(e);

        }

        for (Integer e : treeSet) {
            System.out.println(e);

        }
    }
}
