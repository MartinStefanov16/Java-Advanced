package L04_Matrixes_Excercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = fillMatrix(rows,cols,scanner);


        int biggestSum = 0;
        int[][] newMatrix = new int[3][3];

        // col iterations 2

        for (int row = 0; row < matrix.length-2; row++) {
            for (int col = 0; col < matrix[row].length-2; col++) {
                int internalSum =
                matrix[row][col] +  matrix[row][col+1] + matrix[row][col+2] +
                matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2] +
                matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];

                if (internalSum > biggestSum) {
                    biggestSum = internalSum;
                    newMatrix = new int[][]{
                        {matrix[row][col], matrix[row][col+1], matrix[row][col+2]},
                        {matrix[row+1][col], matrix[row+1][col+1], matrix[row+1][col+2]},
                        {matrix[row+2][col], matrix[row+2][col+1], matrix[row+2][col+2]}
                    };

                }



            }
            }
        System.out.printf("Sum = %d", biggestSum);
        System.out.println();
        printNewMatrix(newMatrix);




        }

    private static void printNewMatrix(int[][] newMatrix) {
        for (int[] row : newMatrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    private static int[][] fillMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        return matrix;
    }


}

