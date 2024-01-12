package L04_Matrixes_Excercise;

import java.util.ArrayList;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {


        List<List<Integer>> list = new ArrayList<>();

        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(2);
        row.add(3);

        list.add(row);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        list.add(row2);

        System.out.println(list);

        int number = list.get(0).get(1);
        System.out.println(number);
    }
}
