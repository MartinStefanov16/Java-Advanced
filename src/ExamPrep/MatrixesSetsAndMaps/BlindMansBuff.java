package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] size = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int playerRow = 0;
        int playerCol = 0;

        String[][] matrix = new String[row][col];
        for (int rows = 0; rows < matrix.length; rows++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = line[cols];

                // TODO - change letter below for player letter
                if (matrix[rows][cols].equals("B")){
                    playerRow = rows;
                    playerCol = cols;
                }
            }
        }

        int peopleTouched = 0;
        int movedMade = 0;

        String input = scanner.nextLine();

        boolean allPeopleTouched =  false;

        while (!input.equals("Finish")){
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

            if (outOfBounds(newRow, newCol, row, col)){
                input = scanner.nextLine();
                continue;
            }

            switch (matrix[newRow][newCol]){
                case "-":
                    movedMade++;
                    matrix[playerRow][playerCol] = "-";
                    matrix[newRow][newCol] = "B";
                    break;
                case "P":
                    peopleTouched++;
                    movedMade++;
                    matrix[playerRow][playerCol] = "-";
                    matrix[newRow][newCol] = "B";
                    if (peopleTouched == 3) {
                        allPeopleTouched = true;
                    }
                    break;
                default:
//                    newRow = playerRow;
//                    newCol = playerCol;
                   input = scanner.nextLine();
                    continue;

            }


            if (allPeopleTouched) {
                break;
            }


            playerRow = newRow;
            playerCol = newCol;

            input = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d\n", peopleTouched,movedMade);
        //printMatrix(matrix);




    }
    private static boolean outOfBounds(int newRow, int newCol, int row, int col) {
        if (newRow < 0 || newRow >= row || newCol < 0 || newCol >= col){
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
