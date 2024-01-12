package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p01a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[][] matrixOne = fillMatrix(scanner);
        int[][] matrixTwo = fillMatrix(scanner);

        boolean areEqual = compareMatrix(matrixOne,matrixTwo);

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        //printMatrix(matrixOne);
        //printMatrix(matrixTwo);

    }

    private static boolean compareMatrix(int[][] matrixOne, int[][] matrixTwo) {

        if (matrixOne.length != matrixTwo.length){
            return false;
        }

        for (int rows = 0; rows < matrixOne.length; rows++) {

            if (matrixOne[rows].length != matrixTwo[rows].length) {
                return false;
            }

            for (int col = 0; col < matrixOne[0].length; col++) {
                int firstElement = matrixOne[rows][col];
                int secondElement = matrixTwo[rows][col];

                if (firstElement != secondElement) {
                    return false;
                }
            }
        }




        return true;
    }

    private static void printMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[rows].length; col++) {
                System.out.print(matrix[rows][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int colms = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][colms];

        for (int row = 0; row < rows; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = array;
        }
        return matrix;
    }
}
