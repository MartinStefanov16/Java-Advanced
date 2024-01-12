package L04_Matrixes_Excercise;

import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        
        fillMatrix(matrix);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix(String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            int asciiValue = row + 97;
            char startingChar = (char) asciiValue;

            for (int col = 0; col < matrix[row].length; col++) {
                StringBuilder text = new StringBuilder();
                int middleCharIndex = row + col + 97;
                char middleChar = (char) middleCharIndex;
                text.append(Character.toString(startingChar));
                text.append(Character.toString(middleChar));
                text.append(Character.toString(startingChar));

                matrix[row][col] = text.toString();
            }
        }
        
        return matrix;
    }
}
