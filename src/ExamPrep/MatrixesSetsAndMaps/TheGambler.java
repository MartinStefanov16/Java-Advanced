package ExamPrep.MatrixesSetsAndMaps;

import java.util.Scanner;

import static java.lang.System.in;

public class TheGambler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = Integer.parseInt(scanner.nextLine());
        int money = 100;

        String[][] matrix = new String[rows][rows];

        int playerRow = 0;
        int playerCol = 0;

        for (int row = 0; row < matrix.length; row++) {
            String theRow = scanner.nextLine();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = String.valueOf(theRow.charAt(col));
                if (matrix[row][col].equals("G")) {
                    playerRow = row;
                    playerCol = col;
                }
            }
        }

                //fillTheMatrix(rows, scanner);

        String input = scanner.nextLine();

        boolean jackpotWon = false;
        boolean exitedField = false;

        while (!input.equals("end")) {
            int nextRow = playerRow;
            int nextCol = playerCol;


            if (validMove(input, matrix, playerRow, playerCol)) {


                // find next coords
                switch (input) {
                    case "up":
                        nextRow--;
                        break;
                    case "down":
                        nextRow++;
                        break;
                    case "left":
                        nextCol--;
                        break;
                    case "right":
                        nextCol++;
                        break;
                }
                // check what's the next field
                switch (matrix[nextRow][nextCol]){
                    case "-":
                        matrix[nextRow][nextCol] = "G";
                        matrix[playerRow][playerCol] = "-";
                        playerRow = nextRow;
                        playerCol = nextCol;
                        break;
                    case "W":
                        money += 100;

                        matrix[nextRow][nextCol] = "G";
                        matrix[playerRow][playerCol] = "-";
                        playerRow = nextRow;
                        playerCol = nextCol;
                        break;
                    case "P":
                        money -= 200;

                        matrix[nextRow][nextCol] = "G";
                        matrix[playerRow][playerCol] = "-";
                        playerRow = nextRow;
                        playerCol = nextCol;
                        break;
                    case "J":
                        money += 100000;

                        jackpotWon = true;

                        matrix[nextRow][nextCol] = "G";
                        matrix[playerRow][playerCol] = "-";
                        playerRow = nextRow;
                        playerCol = nextCol;
                        break;

                }

                if (money <= 0) {
                    break;
                }

                if (jackpotWon) {
                    break;
                }





            } else {
                // exited field
                exitedField = true;
                break;
            }




            input = scanner.nextLine();
        }

        if (jackpotWon && !exitedField) {
            System.out.println("You win the Jackpot!");
            System.out.printf("End of the game. Total amount: %d$\n",money);
            printMatrix(matrix);
        } else if (!jackpotWon && !exitedField && money > 0) {
            System.out.printf("End of the game. Total amount: %d$\n",money);
            printMatrix(matrix);
        } else {
            System.out.println("Game over! You lost everything!");
            //debug
            //System.out.println(money);
        }





    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }

    private static boolean validMove(String input, String[][] matrix, int playerRow, int playerCol) {




        switch (input) {
            case "up":

                if (playerRow != 0) {
                    return true;
                }

                break;
            case "down":

                if (playerRow != matrix.length -1) {
                    return true;
                }

                break;
            case "left":

                if (playerCol != 0) {
                    return true;
                }

                break;
            case "right":

                if (playerCol != matrix.length -1) {
                    return true;
                }
                break;
        }




        return false;
    }


}
