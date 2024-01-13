package L05_SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.TreeSet;

public class demo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


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
