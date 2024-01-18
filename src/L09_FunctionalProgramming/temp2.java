package L09_FunctionalProgramming;

import java.util.Scanner;

public class temp2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int tournamentsPlayed = Integer.parseInt(scanner.nextLine());
            int startingPoints = Integer.parseInt(scanner.nextLine());
            double pointsEarned = 0;
            int wins = 0;

            //String achievedPosition = scanner.nextLine();
            for (int i = 1; i <= tournamentsPlayed; i++) {
                String achievedPosition = scanner.nextLine();
                if (achievedPosition.equals("F")) {
                    pointsEarned += 1200;
                } else if (achievedPosition.equals("SF")) {
                    pointsEarned += 720;
                } else if (achievedPosition.equals("W")) {
                    pointsEarned += 2000;
                    wins += 1;
                }
                //achievedPosition = scanner.nextLine();
            }
            double finalPoints = pointsEarned + startingPoints;
            double winDouble = wins;
            double tournamentsDouble = tournamentsPlayed;
            double percentWonTournaments = (winDouble/tournamentsDouble)*100;


            System.out.printf("Final points: %.0f%n", finalPoints );
            System.out.printf("Average points: %.0f%n", Math.floor(pointsEarned/tournamentsPlayed));
            System.out.printf("%.2f%%", percentWonTournaments );
    }
}
