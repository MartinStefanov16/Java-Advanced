package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        int size = Integer.parseInt(scanner.nextLine());

        int playerRow = 0;
        int playerCol = 0;

        boolean firstMirrorFound = false;

        int firstMirrorRow = 0;
        int firstMirrorCol = 0;
        int secondMirrorRow = 0;
        int secondMirrorCol = 0;

        String[][] matrix = new String[size][size];
        for (int rows = 0; rows < matrix.length; rows++) {
            String line = scanner.nextLine();

            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));

                if (matrix[rows][cols].equals("A")){
                    playerRow = rows;
                    playerCol = cols;
                }

                if (!firstMirrorFound && matrix[rows][cols].equals("M")){
                    firstMirrorRow = rows;
                    firstMirrorCol = cols;
                    firstMirrorFound = true;
                } else if (matrix[rows][cols].equals("M")) {
                    secondMirrorRow = rows;
                    secondMirrorCol = cols;
                }
            }
        }

        int gold = 0;
        boolean leftArmory = false;
        boolean goldGoalReached = false;

        String input = scanner.nextLine();

        // TODO - change the while condition
        while (true){
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

            if (outOfBounds(newRow, newCol, size)){
                leftArmory = true;
                matrix[playerRow][playerCol] = "-";
                break;
            }

            switch (matrix[newRow][newCol]){
                case "-":
                    matrix[newRow][newCol] = "A";
                    matrix[playerRow][playerCol] = "-";
                    break;
                case "M":
                    matrix[playerRow][playerCol] = "-";

                    if (newRow == firstMirrorRow && newCol == firstMirrorCol) {
                        matrix[firstMirrorRow][firstMirrorCol] = "-";
                        matrix[secondMirrorRow][secondMirrorCol] = "A";
                        playerRow = secondMirrorRow;
                        playerCol = secondMirrorCol;
                    } else {
                        matrix[secondMirrorRow][secondMirrorCol] = "-";
                        matrix[firstMirrorRow][firstMirrorCol] = "A";
                        playerRow = firstMirrorRow;
                        playerCol = firstMirrorCol;
                    }

                    input = scanner.nextLine();

                    continue;
                default:
                    int swordValue = Integer.parseInt(matrix[newRow][newCol]);
                    gold += swordValue;
                    matrix[newRow][newCol] = "A";
                    matrix[playerRow][playerCol] = "-";
                    break;

            }

            if (gold >= 65){
                goldGoalReached = true;
                break;
            }




            playerRow = newRow;
            playerCol = newCol;

            input = scanner.nextLine();
        }

        if (leftArmory) {
            System.out.println("I do not need more swords!");
        } else {
            System.out.println("Very nice swords, I will come back for more!");
        }

        System.out.printf("The king paid %d gold coins.\n", gold);

        printMatrix(matrix);




    }
    private static boolean outOfBounds(int newRow, int newCol, int size) {
        if (newRow < 0 || newRow >= size || newCol < 0 || newCol >= size){
            return true;
        }
        return false;
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
