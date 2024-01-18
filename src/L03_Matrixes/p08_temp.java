package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

public class p08_temp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        int[][] originalMatrix = new int[rowsAndCols][];
        int[][] updatedMatrix = new int[rowsAndCols][];


        for (int row = 0; row < rowsAndCols; row++) {
            int[] input = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            originalMatrix[row] = input;
            updatedMatrix[row] = input.clone();
        }
        int[] coordinatesForWrongNumber = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rowOfWrongNumber = coordinatesForWrongNumber[0];
        int colOfWrongNumber = coordinatesForWrongNumber[1];

        int wrongNumber = originalMatrix[rowOfWrongNumber][colOfWrongNumber];

        for (int row = 0; row < originalMatrix.length; row++) {
            for (int col = 0; col < originalMatrix[row].length; col++) {
                int sum = 0;
                int currentNumber = originalMatrix[row][col];
                if (currentNumber == wrongNumber) {
                    //ляво
                    if (col - 1 > 0) {
                        if (originalMatrix[row][col - 1] != wrongNumber) {
                            sum += originalMatrix[row][col - 1];
                        }
                    }
                    //нагоре
                    if (row - 1 >= 0) {
                        if (originalMatrix[row - 1][col] != wrongNumber) {
                            sum += originalMatrix[row - 1][col];
                        }
                    }
                    //надясно
                    if (col + 1 < rowsAndCols) { // change to <
                        if (originalMatrix[row][col + 1] != wrongNumber) {
                            sum += originalMatrix[row][col + 1];
                        }
                    }
                    //надолу
                    if (row + 1 < rowsAndCols) {
                        if (originalMatrix[row + 1][col] != wrongNumber) {
                            sum += originalMatrix[row + 1][col];
                        }
                    }
                    updatedMatrix[row][col] = sum;
                }
            }
        }
        for (int [] row : updatedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
