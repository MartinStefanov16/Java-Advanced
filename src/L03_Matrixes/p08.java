package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = fillMatrix(scanner, size);
        System.out.println();

        int wrongValue = findWrongValue(matrix, scanner);
        matrix = editMatrix(matrix, wrongValue);
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

    private static int[][] editMatrix(int[][] matrix, int wrongValue) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] newMatrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == wrongValue) {
                    int sum = 0;

                    if (row != 0){
                        if (matrix[row - 1][col] != wrongValue) {
                            sum += matrix[row - 1][col];
                        }
                        //UP
                    }

                    if (row != matrix.length - 1) {
                        if (matrix[row + 1][col] != wrongValue) {
                            sum += matrix[row + 1][col];
                        }
                        // DOWN
                    }

                    if (col != 0) {
                        if (matrix[row][col - 1] != wrongValue) {
                            sum += matrix[row][col - 1];
                        }
                        // LEFT
                    }

                    if (col != matrix[row].length -1) {
                        if (matrix[row][col + 1] != wrongValue) {
                            sum += matrix[row][col + 1];
                        }
                        // RIGHT
                    }

                    newMatrix[row][col] = sum;

                } else {
                    newMatrix[row][col] = matrix[row][col];
                }


            }
        }



        return newMatrix;
    }

    private static int findWrongValue(int[][] matrix, Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);


        return matrix[row][col];
    }

    private static int[][] fillMatrix(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = array;
        }

        return matrix;
    }
}
