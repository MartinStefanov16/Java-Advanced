package L04_Matrixes_Excercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[size][size];

        switch (type){
            case "A":
                patternA(matrix);
                break;
            case "B":
                patternB(matrix);
                break;
        }

        printMatrix(matrix);


    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    private static int[][] patternB(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {

            if (col % 2 !=0) {
                // from DOWN to UP
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = counter++;
                }

            } else {
                // from UP to DOWN
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = counter++;
                }
            }
        }
        return matrix;
    }

    private static int[][] patternA(int[][] matrix) {
        int counter = 1;

        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = counter++;
            }
        }
        return matrix;
    }
}
