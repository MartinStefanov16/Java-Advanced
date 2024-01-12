package L03_Matrixes;

import java.util.Scanner;

import static java.lang.System.in;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[][] matrix = new int[3][3];
        int counter = 1;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = counter++;
            }
        }

        System.out.println();
    }
}
