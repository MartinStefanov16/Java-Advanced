package ExamPrep.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> textiles = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(textiles::offer);

        ArrayDeque<Integer> medicaments = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .forEach(medicaments::push);

        Map<String, Integer> inventory = new TreeMap<>();
        inventory.put("Patch", 0);
        inventory.put("Bandage", 0);
        inventory.put("MedKit", 0);

        while (!textiles.isEmpty() && !medicaments.isEmpty()){
            int textile = textiles.peek();
            int medicament = medicaments.peek();
            int sum = textile + medicament;

            //+ if sum == 30 , 40 , 100
            //+ create that item
            //+ remove textile and medicament

            if (sum == 30 || sum == 40 || sum == 100){
                int currentNum = 0;

                switch (sum){
                    case 30:
                        inventory.put("Patch", inventory.get("Patch") +1);
                        break;
                    case 40:
                        inventory.put("Bandage", inventory.get("Bandage") +1);
                        break;
                    case 100:
                        inventory.put("MedKit", inventory.get("MedKit") +1);
                        break;
                }
                textiles.poll();
                medicaments.pop();

            } else if (sum > 100) {
                inventory.put("MedKit", inventory.get("MedKit") +1);
                textiles.poll();
                medicaments.pop();

                sum -= 100;
                int nextMedi = medicaments.pop();
                medicaments.push(nextMedi + sum);

            } else {
                textiles.poll();
                medicament += 10;
                medicaments.pop();
                medicaments.push(medicament);

            }

            // if  sum > 100
            //+ create medkit
            //+ remove textile and medicament
            //+ sum -= 100
            //+ take next medicament, add sum to it, add the medicament back

            // else
            //+ remove textile
            // add 10 to medicament
            // replace the old medicament


        }

        if (textiles.isEmpty() && medicaments.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        } else if (textiles.isEmpty()){
            System.out.println("Textiles are empty.");
        } else if (medicaments.isEmpty()){
            System.out.println("Medicaments are empty.");
        }


        inventory.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .filter(entry -> entry.getValue() != 0)
                .forEach(entry -> {
                    System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
                });

        if (!medicaments.isEmpty()) {
            System.out.print("Medicaments left: ");
            System.out.println(medicaments.toString().replaceAll("[\\[\\]]", ""));
        }

        if (!textiles.isEmpty()) {
            System.out.print("Textiles left: ");
            System.out.println(textiles.toString().replaceAll("[\\[\\]]", ""));
        }







    }
}
