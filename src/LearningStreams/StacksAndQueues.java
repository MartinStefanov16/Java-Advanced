package LearningStreams;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class StacksAndQueues {
    public static void main(String[] args) {


        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);


        // normal print
        //System.out.println(stack.toString());
        // prints each element, with a "," in between
        System.out.println(stack.toString().replaceAll("[\\[\\]]", ""));


        //System.out.println(stack.stream().filter(e -> e % 2 == 0).toString().replaceAll("[\\[\\]]", ""));


    }
}
