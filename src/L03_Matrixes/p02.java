package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[][] matrix = fillMatrix(scanner);

        int number = Integer.parseInt(scanner.nextLine());

        checkForNumber(matrix,number);


    }

    private static void checkForNumber(int[][] matrix, int number) {

        boolean matchFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == number) {
                    System.out.println(row + " " + col);
                    matchFound = true;
                }

            }
        }

        if (!matchFound) {
            System.out.println("not found");
        }




    }

    private static int[][] fillMatrix(Scanner scanner) {

        String[] dimentions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimentions[0]);
        int colms = Integer.parseInt(dimentions[1]);

        int[][] matrix = new int[rows][colms];

        for (int row = 0; row < matrix.length; row++) {

                int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                matrix[row] = array;
        }



        return matrix;
    }
}
