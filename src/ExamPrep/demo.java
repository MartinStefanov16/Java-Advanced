package ExamPrep;

import java.util.ArrayDeque;

public class demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(17);
        stack.push(20);
        stack.push(25);

        ArrayDeque<Integer> stack2 = new ArrayDeque<>();

        stack2.push(17);
        stack2.push(20);

        while (!stack.isEmpty() && !stack2.isEmpty()) {
            stack.pop();
            stack2.pop();
        }


    }
}
