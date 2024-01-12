package L03_Matrixes;

import java.util.Scanner;

import static java.lang.System.in;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] matrixOne = fillMatrix(rows,cols,scanner);
        char[][] matrixTwo = fillMatrix(rows,cols,scanner);

        char[][] outputMatrix = intersectMatrixes(matrixOne,matrixTwo,rows, cols);
        printMatrix(outputMatrix);

    }

    private static void printMatrix(char[][] outputMatrix) {
        for (char[] rows : outputMatrix) {
            for (char character : rows) {
                System.out.print(character + " ");
            }
            System.out.println();
        }

    }

    private static char[][] intersectMatrixes(char[][] matrixOne, char[][] matrixTwo, int rows, int cols) {

        char[][] charMatrix = new char[rows][cols];

        for (int row = 0; row < matrixOne.length; row++) {
            for (int col = 0; col < matrixOne[row].length; col++) {
                char elementOne = matrixOne[row][col];
                char elementTwo = matrixTwo[row][col];

                if (elementOne == elementTwo) {
                    charMatrix[row][col] = elementOne;
                } else {
                    charMatrix[row][col] = '*';
                }



            }
        }

        return charMatrix;


    }

    private static char[][] fillMatrix(int rows, int cols, Scanner scanner) {

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < matrix.length; row++) {

            char[] array = scanner.nextLine().replace(" ", "").toCharArray();
            matrix[row] = array;

        }


        return matrix;
    }
}
