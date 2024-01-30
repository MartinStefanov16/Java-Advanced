package LearningStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {

        Map<String, Integer> inventory = new TreeMap<>();
        inventory.put("Patch", 1);
        inventory.put("Bandage", 2);
        inventory.put("MedKit", 0);


        // Filters out items that are 0
        // sorts entries by their value, descending
        //prints

        inventory.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .filter(entry -> entry.getValue() != 0)
                .forEach(entry ->
                    System.out.printf("%s - %d%n", entry.getKey(), entry.getValue()));

       //inventory.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

//        inventory.entrySet().stream()
//                .sorted((e1,e2) -> e1.getValue().compareTo(e2.getValue()))
//                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));



    }
}
