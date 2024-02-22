package Exam;

import java.util.Scanner;

import static java.lang.System.in;

public class Map {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        int playerRow = 0;
        int playerCol = 0;

        String[][] matrix = new String[size][size];
        for (int rows = 0; rows < matrix.length; rows++) {
            String line = scanner.nextLine();

            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));

                if (matrix[rows][cols].equals("J")){
                    playerRow = rows;
                    playerCol = cols;
                }
            }
        }

        String input = scanner.nextLine();

        int playerHealth = 300;
        int enemyPlanesOnGrid = 4;
        boolean playerKilled = false;
        boolean enemiesKilled = false;

        while (playerHealth > 0 && enemyPlanesOnGrid > 0){
            int newRow = playerRow;
            int newCol = playerCol;

            switch (input){
                case "up":
                    newRow--;
                    break;
                case "down":
                    newRow++;
                    break;
                case "left":
                    newCol--;
                    break;
                case "right":
                    newCol++;
                    break;
            }


            switch (matrix[newRow][newCol]){
                case "-":
                    matrix[playerRow][playerCol] = "-";
                    matrix[newRow][newCol] = "J";
                    break;
                case "E":
                    if (enemyPlanesOnGrid != 1){
                        playerHealth -= 100;
                    }
                    enemyPlanesOnGrid--;
                    matrix[playerRow][playerCol] = "-";
                    matrix[newRow][newCol] = "J";

                    if (playerHealth <= 0){
                        playerKilled = true;
                    }

                    if (enemyPlanesOnGrid == 0){
                        enemiesKilled = true;
                    }

                    break;
                case "R":
                    if (playerHealth < 300) {
                        playerHealth += 300;
                    }

                    matrix[playerRow][playerCol] = "-";
                    matrix[newRow][newCol] = "J";
                    break;
            }



            playerRow = newRow;
            playerCol = newCol;

            if (playerKilled || enemiesKilled){
                break;
            }

            input = scanner.nextLine();
        }

        if (enemyPlanesOnGrid == 0){
            System.out.println("Mission accomplished, you neutralized the aerial threat!");
        } else {
            System.out.printf("Mission failed, your jetfighter was shot down! Last coordinates [%d, %d]!\n", playerRow, playerCol);
        }

        printMatrix(matrix);



    }


    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}