package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = fillMatrix(size, scanner);

        printDiagonalOne(matrix);
        printDiagonalTwo(matrix);



    }

    private static void printDiagonalTwo(int[][] matrix) {
        int index = matrix.length - 1;


        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[index][row] + " ");
            index--;
        }
    }

    private static void printDiagonalOne(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            System.out.print(matrix[row][row] + " ");
        }
        System.out.println();


    }

    private static int[][] fillMatrix(int size, Scanner scanner) {
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
