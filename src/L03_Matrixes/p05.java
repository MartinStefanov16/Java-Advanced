package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = fillMatrix(rows,cols, scanner);

        int biggestSum = 0;
        int[][] biggestSumMatrix = new int[2][2];

        for (int row = 0; row < matrix.length -1 ; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int internalMax = matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row +1][col] +
                        matrix[row +1][col +1];

                if (internalMax > biggestSum) {
                    biggestSum = internalMax;
                    biggestSumMatrix = new int[][]{
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]},
                    };
                }

            }
        }



        printSmallMatrix(biggestSumMatrix);
        System.out.println(biggestSum);









    }

    private static void printSmallMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");

            }
            System.out.println();

        }

    }

    private static int[][] fillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {

            int[] array = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = array;

        }


        return matrix;
    }

}
