package L06_SetsAndMapsAdvanced_Excercise;

import java.util.*;

import static java.lang.System.in;

public class P13DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            // adding data
            dragons.putIfAbsent(type, new TreeMap<>());
            Map<String, int[]> namesAndStats = dragons.get(type);

            namesAndStats.putIfAbsent(name, new int[3]);
            int[] stats = namesAndStats.get(name);
            stats[0] = damage;
            stats[1] = health;
            stats[2] = armor;
        }

        for (Map.Entry<String, Map<String, int[]>> type : dragons.entrySet()) {
            double damageSum = 0.0;
            double healthSum= 0.0;
            double armorSum= 0.0;
            int numberOfDragonsInType = type.getValue().size();
            for (Map.Entry<String, int[]> entry : type.getValue().entrySet()) {
                damageSum += entry.getValue()[0];
                healthSum += entry.getValue()[1];
                armorSum += entry.getValue()[2];
            }
            System.out.printf("%s::(%.2f/%.2f/%.2f)\n",
                    type.getKey(),
                    damageSum / numberOfDragonsInType,
                    healthSum / numberOfDragonsInType,
                    armorSum / numberOfDragonsInType);

            for (Map.Entry<String, int[]> entry : type.getValue().entrySet()) {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",
                        entry.getKey(),
                        entry.getValue()[0],
                        entry.getValue()[1],
                        entry.getValue()[2]);
            }

        }

    }
}
