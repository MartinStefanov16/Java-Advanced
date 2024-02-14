package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class template {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String input = null;

        int row = 1;
        int col = 1;

        // filling matrix and getting player position
        // if matrix elements are not seperated
        int playerRow = 0;
        int playerCol = 0;

        String[][] matrix = new String[row][col];
        for (int rows = 0; rows < matrix.length; rows++) {
            String line = scanner.nextLine();
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));

                // TODO - change letter below for player letter
                if (matrix[rows][cols].equals("B")){
                    playerRow = rows;
                    playerCol = cols;
                }
            }

        }

        // if matrix elements are seperated by space

        // TODO - comment out the line below
        //String[][] matrix = new String[row][col];
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

        // order of movement logic
        // initilaize newRow and newCol, same value as player pos

        int newRow = playerRow;
        int newCol = playerCol;

        // update the new pos:
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

        // check for outOfBounds with method
        if (outOfBounds(newRow, newCol, row, col)){
            //TODO - logic for what happens when out of bounds
        }

        // the switch for the move
        switch (matrix[newRow][newCol]){
            case "":
                break;

        }

    }

    private static boolean outOfBounds(int newRow, int newCol, int row, int col) {
        if (newRow < 0 || newRow >= row || newCol < 0 || newCol >= col){
            return true;
        }
        return false;
    }
}
