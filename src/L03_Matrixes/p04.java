package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class p04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = fillMatrix(rows,cols, scanner);

        System.out.println(rows);
        System.out.println(cols);

        int output = getSum(matrix);
        System.out.println(output);


    }

    private static int getSum(int[][] matrix) {
        int sum = 0;

        for (int[] rows : matrix) {
            for (int cols : rows) {
                sum += cols;
            }

        }




        return sum;
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
