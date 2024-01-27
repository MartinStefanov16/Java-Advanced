package ExamPrep.StacksAndQueues;

import java.util.ArrayDeque;

public class demo {
    public static void main(String[] args) {


        ArrayDeque<String> altitudes = new ArrayDeque<>();
        int altitudeReached = 0;


        for (int i = 0; i < 5; i++) {
            String current = "Altitude " + String.valueOf(altitudeReached);
            altitudes.offer(current);
            altitudeReached++;

        }
        System.out.println();
    }
}
