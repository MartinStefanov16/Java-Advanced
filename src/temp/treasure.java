package temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class treasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        List<String> inventory = new ArrayList<>(Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList()));

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")){
            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command){
                case "Loot":
                    for (int i = 1; i <=  commandParts.length - 1; i++) {
                        if (!inventory.contains(commandParts[i])){
                            inventory.add(0,commandParts[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index >= 0 && index < inventory.size()){
                        String droppedItem = inventory.get(index);
                        inventory.remove(index);
                        inventory.add(droppedItem);
                    }
                    break;
                case "Steal":
                    List<String> tempListForEasyPrinting = new ArrayList<>();

                    int count = Integer.parseInt(commandParts[1]);

                    if (count > inventory.size()){
                        count = inventory.size();
                    }

                    for (int i = 0; i < count; i++) {
                        String itemToRemove = inventory.remove(inventory.size()-1);
                        tempListForEasyPrinting.add(0, itemToRemove);
                    }

                    System.out.println(tempListForEasyPrinting.toString().replaceAll("[\\[\\]]", ""));
                    break;
            }


            input = scanner.nextLine();
        }


        if (inventory.isEmpty()){
            System.out.println("Failed treasure hunt.");
        } else {
            int sum = 0;
            for (String item : inventory) {
                sum += item.length();
            }
            double averageTreasureGain = (double)sum / inventory.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", averageTreasureGain);
        }
    }
}
