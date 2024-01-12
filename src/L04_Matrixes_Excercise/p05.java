package L04_Matrixes_Excercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;

public class p05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        String[] inputSize = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(inputSize[0]);
        int cols = Integer.parseInt(inputSize[1]);

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix,scanner);

        Pattern pattern = Pattern.compile("(?<keyWord>[swap]+)\\s(?<one>[0-9]+)\\s(?<two>[0-9]+)\\s(?<three>[0-9]+)\\s(?<four>[0-9]+)");


        String input = scanner.nextLine();
        while (!input.equals("END")){
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            int row1 = Integer.parseInt(matcher.group("one"));
            int col1 = Integer.parseInt(matcher.group("two"));
            int row2 = Integer.parseInt(matcher.group("three"));
            int col2 = Integer.parseInt(matcher.group("four"));

            if (row1 == row2 || col1 == col2) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            if (row1 >= rows || row2 >= rows || col1 >= cols || col2 >= cols) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            swapElements(matrix,row1,col1,row2,col2);
            printMatrix(matrix);





            input = scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static String[][] swapElements(String[][] matrix, int row1, int col1, int row2, int col2) {
        String elementOne = matrix[row1][col1];
        String elementTwo = matrix[row2][col2];

        matrix[row1][col1] = elementTwo;
        matrix[row2][col2] = elementOne;

        return matrix;
    }

    private static String[][] fillMatrix(String[][] matrix, Scanner scanner) {

        for (int rows = 0; rows < matrix.length; rows++) {
            matrix[rows] = scanner.nextLine().split(" ");

        }

        return matrix;
    }

}


