package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;

public class demo {
    public static void main(String[] args) {


        double milk = 60;
        double cacao = 60;
        double cacaoPercentage = Math.ceil(cacao / (milk + cacao) * 100);
        System.out.println(cacaoPercentage);
    }
}
