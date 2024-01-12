package L04_Matrixes_Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class p06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rotation = Integer.parseInt(scanner.nextLine().split("[()]")[1]);
        int rotations = rotation % 360;
        String input = scanner.nextLine();

        List<String> words = new ArrayList<>();

        int longestWord = Integer.MIN_VALUE;

        while (!input.equals("END")) {
            words.add(input);

            if (input.length() > longestWord) {
                longestWord = input.length();
            }

            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = longestWord;

        char[][] matrix = fillMatrix(rows,cols,words);
        printMatrix(matrix);
        System.out.println();

        switch (rotations) {
            case 90:
                matrix = rotate90Degrees(matrix, rows, cols);
                break;
            case 180:
                matrix = rotate90Degrees(matrix, rows, cols);
                matrix = rotate90Degrees(matrix, cols, rows);
                break;
            case 270:
                matrix = rotate90Degrees(matrix, rows, cols);
                matrix = rotate90Degrees(matrix, cols, rows);
                matrix = rotate90Degrees(matrix, rows, cols);
                break;
        }

        printMatrix(matrix);






    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }


    private static char[][]  rotate90Degrees(char[][] matrix, int rows, int cols) {
        char[][] newMatrix = new char[cols][rows];

        for (int col = 0; col < cols; col++) {
            int index = 0;
            for (int row = rows - 1; row >= 0; row--) {
                newMatrix[col][index++] = matrix[row][col];
            }
        }

        return newMatrix;
    }


    private static char[][] fillMatrix(int rows, int cols, List<String> words) {
        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++) {

                if (col < currentWord.length()) {
                    matrix[row][col] = currentWord.charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
        return matrix;
    }
}
