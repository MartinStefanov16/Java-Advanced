package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class FishingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        String[][] matrix = new String[size][size];

        int shipRow = 0;
        int shipCol = 0;

        for (int rows = 0; rows < size; rows++) {
            String line = scanner.nextLine();
            for (int cols = 0; cols < size; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));

                if (matrix[rows][cols].equals("S")) {
                    shipRow = rows;
                    shipCol = cols;
                }



            }
        }
        String input = scanner.nextLine();

        int fishCollected = 0;

        while (!input.equals("collect the nets")) {
            int newRow = shipRow;
            int newCol = shipCol;

            // get new coords
            // if out of field, go opposite

            switch (input) {
                case "up":

                    if (shipRow == 0) {
                        newRow = size - 1;
                    } else {
                        newRow--;
                    }

                    break;
                case "down":
                    if (shipRow == size - 1) {
                        newRow = 0;
                    } else {
                        newRow++;
                    }
                    break;
                case "left":
                    if (shipCol == 0) {
                        newCol = size - 1;
                    } else {
                        newCol--;
                    }
                    break;
                case "right":
                    if (shipCol == size - 1) {
                        newCol = 0;
                    } else {
                        newCol++;
                    }
                    break;

            }
            // check what item you land on

            switch (matrix[newRow][newCol]){
                case "-":
                    // move ship to new cell
                    // replace old cell with dash
                    matrix[newRow][newCol] = "S";
                    matrix[shipRow][shipCol] = "-";
                    break;
                case "W":
                    // death
                    System.out.printf
                    ("You fell into a whirlpool! The ship sank and you lost the fish you caught. Last coordinates of the ship: [%d,%d]\n"
                    ,newRow, newCol);
                    return;
                default:
                    fishCollected += Integer.parseInt(matrix[newRow][newCol]);
                    matrix[newRow][newCol] = "S";
                    matrix[shipRow][shipCol] = "-";
                    break;

            }

            shipRow = newRow;
            shipCol = newCol;


            //printMatrix(matrix);

            input = scanner.nextLine();
        }
        // -------------

        // 20t reached
        // 20t not reached

        if (fishCollected >= 20) {
            System.out.println("Success! You managed to reach the quota!");
        } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.\n", 20 - fishCollected);
        }

        if (fishCollected > 0) {
            System.out.printf("Amount of fish caught: %d tons.\n", fishCollected);
        }


        // if fish > 0 - print amount

        // print matrix
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
