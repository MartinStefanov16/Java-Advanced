package L05_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;

public class demoMap {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new LinkedHashMap<>();

        myMap.put("Marty", 10);
        myMap.put("Ivan", 20);
        myMap.put("Mike", 30);

        // prints only keys
        for (String key : myMap.keySet()) {
            System.out.println(key);
        }

        // prints only values
        for (Integer value : myMap.values()) {
            System.out.println(value);
        }


    }
}
