package temp;

import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.forEach((a, b) -> System.out.println(a + " " + b) );
    }
}
