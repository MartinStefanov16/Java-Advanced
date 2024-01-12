package L03_Matrixes;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class fillingMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        int[][] matrix = fillMatrix(scanner);
        System.out.println();

    }

    private static int[][] fillMatrix(Scanner scanner) {
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int colms = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][colms];

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;

            
        }

        return matrix;


    }
}
