package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        ArrayDeque<Integer> steel = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(steel::offer);

        ArrayDeque<Integer> carbon = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(carbon::push);

        int sabre = 0;
        int katana = 0;
        int shamshir = 0;
        int gladius = 0;

        while (!steel.isEmpty() && !carbon.isEmpty()){
            int steelPiece = steel.poll();
            int carbonPiece = carbon.pop();
            int sum = steelPiece + carbonPiece;

            switch (sum){
                case 70:
                    gladius++;
                    break;
                case 80:
                    shamshir++;
                    break;
                case 90:
                    katana++;
                    break;
                case 110:
                    sabre++;
                    break;
                default:
                    carbon.push(carbonPiece + 5);
                    break;
            }
        }
        int swordsForged = gladius + shamshir + katana + sabre;

        if (swordsForged > 0){
            System.out.printf("You have forged %d swords.\n", swordsForged);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        if (steel.isEmpty()){
            System.out.println("Steel left: none");
        } else {
            System.out.println("Steel left: " + steel.toString().replaceAll("[\\[\\]]", ""));
        }

        if (carbon.isEmpty()){
            System.out.println("Carbon left: none");
        } else {
            System.out.println("Carbon left: " + carbon.toString().replaceAll("[\\[\\]]", ""));
        }



        if (gladius > 0){
            System.out.printf("Gladius: %d\n", gladius);
        }
        if (katana > 0){
            System.out.printf("Katana: %d\n", katana);
        }

        if (sabre > 0){
            System.out.printf("Sabre: %d\n", sabre);
        }

        if (shamshir > 0){
            System.out.printf("Shamshir: %d\n", shamshir);
        }

    }
}
