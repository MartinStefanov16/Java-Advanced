package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class templateTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] size = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int playerRow = 0;
        int playerCol = 0;

        String[][] matrix = new String[row][col];
        for (int rows = 0; rows < matrix.length; rows++) {
            String line = scanner.nextLine();
            // TODO - if matrix rows are seperated by space, use the line below
            //String[] line = scanner.nextLine().split("\\s+");
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));
                // TODO - if matrix rows are seperated by space, use the line below
                //matrix[rows][cols] = line[cols];

                // TODO - change letter below for player letter
                if (matrix[rows][cols].equals("B")){
                    playerRow = rows;
                    playerCol = cols;
                }
            }
        }

        String input = scanner.nextLine();

        // TODO - change the while condition "";
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
                //TODO - logic for what happens when stepped out of bounds
            }

            switch (matrix[newRow][newCol]){
                case "":
                    break;

            }


            playerRow = newRow;
            playerCol = newCol;

            input = scanner.nextLine();
        }




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
