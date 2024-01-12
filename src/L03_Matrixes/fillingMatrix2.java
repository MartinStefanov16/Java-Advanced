package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class fillingMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = 2;
        int columns = 3;

        int[][] matrix = new int[rows][columns];

        for (int row = 0; row < rows; row++) {

            int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = array;
        }

        printMatrix(matrix);



    }

    private static void printMatrix(int[][] matrix) {

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[rows].length; col++) {
                System.out.print(matrix[rows][col] + " ");
            }
            System.out.println();
        }


    }
}
