package ExamPrep;

import java.util.Scanner;

import static java.lang.System.in;

public class StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] moves = scanner.nextLine().split(",");

        String[][] matrix = new String[size][size];

        int playerRow = 0;
        int playerCol = 0;

        int money = 0;

        for (int rows = 0; rows < matrix.length; rows++) {
            String[] array = scanner.nextLine().split(" ");
            for (int cols = 0; cols < matrix.length; cols++) {
                matrix[rows][cols] = array[cols];
                if (array[cols].equals("D")){
                    playerRow = rows;
                    playerCol = cols;
                }
            }
        }
        boolean isJailed = false;

        //moves
        for (int i = 0; i < moves.length; i++) {
            String move = moves[i];
            int newRow = playerRow;
            int newCol = playerCol;

            switch (move) {
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

            if (gonnaStepOut(newRow,newCol, size - 1)){
                System.out.println("You cannot leave the town, there is police outside!");
                newRow = playerRow;
                newCol = playerCol;
                continue;
            }

            switch (matrix[newRow][newCol]){
                case "+":
                    matrix[playerRow][playerCol] = "+";
                    matrix[newRow][newCol] = "D";
                    break;
                case "$":
                    money += newRow * newCol;
                    System.out.printf("You successfully stole %d$.\n",  newRow * newCol);
                    matrix[playerRow][playerCol] = "+";
                    matrix[newRow][newCol] = "D";
                    break;
                case "P":
                    matrix[playerRow][playerCol] = "+";
                    matrix[newRow][newCol] = "#";
                    isJailed = true;
                    break;
            }

            playerRow = newRow;
            playerCol = newCol;
            if (isJailed){
                break;
            }
        }

        if (!isJailed){
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.\n",money);
        } else {
            System.out.printf("You got caught with %d$, and you are going to jail.\n", money);
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {

    }

    private static boolean gonnaStepOut(int newRow, int newCol, int size) {

        if (newRow < 0 || newCol < 0){
            return true;
        }

        if (newRow > size || newCol > size){
            return true;
        }

        return false;
    }
}
