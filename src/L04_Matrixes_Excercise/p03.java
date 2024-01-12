package L04_Matrixes_Excercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][];

        fillMatrix(matrix, scanner);
        int diagonalOne = findDiagonalOne(matrix);
        int diagonalTwo = findDiagonalTwo(matrix);
        printDifference(diagonalOne,diagonalTwo);


    }

    private static void printDifference(int diagonalOne, int diagonalTwo) {

        if (diagonalOne >= diagonalTwo) {
            System.out.println(diagonalOne - diagonalTwo);
        } else {
            System.out.println(diagonalTwo - diagonalOne);
        }


    }

    private static int findDiagonalTwo(int[][] matrix) {
        int sum = 0;
        int index = matrix.length - 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (col == index) {
                    if (matrix[row][col] >= 0){
                        //taketh
                        sum += matrix[row][col];
                    } else {
                        sum -= Math.abs(matrix[row][col]);
                    }
                    index--;
                }

            }
        }

        return sum;
    }

    private static int findDiagonalOne(int[][] matrix) {
        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (row == col) {
                    if (matrix[row][col] >= 0) {
                        sum += matrix[row][col];
                    } else {
                        sum -= Math.abs(matrix[row][col]);
                    }
                }

            }
        }
        return sum;
    }

    private static int[][] fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            int[] array = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = array;
        }

        return matrix;
    }
}
