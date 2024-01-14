package L06_SetsAndMapsAdvanced_Excercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.in;

public class P04CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String text = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (char c : text.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                int currentCount = map.get(c);
                map.put(c, currentCount +1);
            }
        }

        for (Map.Entry<Character, Integer> character : map.entrySet()) {
            System.out.printf("%s: %d time/s\n", character.getKey(), character.getValue());


        }

    }
}
