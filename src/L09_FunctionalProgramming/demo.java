package L09_FunctionalProgramming;

import java.util.function.*;

public class demo {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> sameNumbers = (x, y) -> x == y;

        System.out.println(sameNumbers.test(1,2));




    }
}
