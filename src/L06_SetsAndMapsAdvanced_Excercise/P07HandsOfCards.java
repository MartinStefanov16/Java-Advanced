package L06_SetsAndMapsAdvanced_Excercise;

import java.util.*;

import static java.lang.System.in;

public class P07HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        Map<String, Set<String>> decks = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {
            String[] parts = input.split(": ");
            String name = parts[0];
            String[] cards =parts[1].split(", ");

            decks.putIfAbsent(name, new LinkedHashSet<>());
            Set<String> hand = decks.get(name);
            hand.addAll(List.of(cards));

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : decks.entrySet()) {
            System.out.printf("%s: ", entry.getKey());
            int sumScore = 0;
            for (String card : entry.getValue()) {
                int score = calcCardScore(card);
                sumScore += score;

            }
            System.out.print(sumScore);
            System.out.println();

        }


    }

    private static int calcCardScore(String card) {
        int firstNum = 0;
        int secondNum = 0;

        char firstElement = card.charAt(0);
        char secondElement = card.charAt(card.length()-1);

        switch (firstElement) {
            case '2':
                firstNum = 2;
                break;
            case '3':
                firstNum = 3;
                break;
            case '4':
                firstNum = 4;
                break;
            case '5':
                firstNum = 5;
                break;
            case '6':
                firstNum = 6;
                break;
            case '7':
                firstNum = 7;
                break;
            case '8':
                firstNum = 8;
                break;
            case '9':
                firstNum = 9;
                break;
            case '1':
                firstNum = 10;
                break;
            case 'J':
                firstNum = 11;
                break;
            case 'Q':
                firstNum = 12;
                break;
            case 'K':
                firstNum = 13;
                break;
            case 'A':
                firstNum = 14;
                break;
        }

        switch (secondElement) {
            case 'S':
                secondNum = 4;
                break;
            case 'H':
                secondNum = 3;
                break;
            case 'D':
                secondNum = 2;
                break;
            case 'C':
                secondNum = 1;
                break;
        }



        return firstNum * secondNum;
    }
}
