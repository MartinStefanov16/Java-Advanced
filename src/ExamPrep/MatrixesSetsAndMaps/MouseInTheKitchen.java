package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] size = scanner.nextLine().split(",");
        int row = Integer.parseInt(size[0]);
        int col = Integer.parseInt(size[1]);

        int mouseRow = 0;
        int mouseCol = 0;

        int cheeseAmount = 0;
        int cheeseEaten =  0;

        String[][] matrix = new String[row][col];
        for (int rows = 0; rows < matrix.length; rows++) {
            String line = scanner.nextLine();
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                matrix[rows][cols] = String.valueOf(line.charAt(cols));

                if (matrix[rows][cols].equals("M")){
                    mouseRow = rows;
                    mouseCol = cols;
                }

                if (matrix[rows][cols].equals("C")){
                    cheeseAmount++;
                }
            }

        }

        boolean allCheeseEaten = false;
        boolean steppedOutOfBounds = false;
        boolean trapped = false;

        String input = scanner.nextLine();

        while (!input.equals("danger")){
            int newRow = mouseRow;
            int newCol = mouseCol;

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
                steppedOutOfBounds = true;
                break;
            }

            switch (matrix[newRow][newCol]){
                case "*":
                    matrix[mouseRow][mouseCol] = "*";
                    matrix[newRow][newCol] = "M";
                    break;
                case "C":
                    matrix[mouseRow][mouseCol] = "*";
                    matrix[newRow][newCol] = "M";
                    cheeseEaten++;
                    if (cheeseAmount == cheeseEaten){
                        allCheeseEaten = true;
                    }
                    break;
                case "T":
                    matrix[mouseRow][mouseCol] = "*";
                    matrix[newRow][newCol] = "M";
                    trapped = true;
                    break;
                default:
                    input = scanner.nextLine();
                    continue;
            }

            mouseRow = newRow;
            mouseCol = newCol;

            if (allCheeseEaten || steppedOutOfBounds || trapped){
                break;
            }



            input = scanner.nextLine();
        }

        if (steppedOutOfBounds){
            System.out.println("No more cheese for tonight!");
        } else if (allCheeseEaten){
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        } else if (trapped){
            System.out.println("Mouse is trapped!");
        } else {
            System.out.println("Mouse will come back later!");
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

    private static boolean outOfBounds(int newRow, int newCol, int row, int col) {
        if (newRow < 0 || newRow >= row || newCol < 0 || newCol >= col){
            return true;
        }

        return false;
    }


}
