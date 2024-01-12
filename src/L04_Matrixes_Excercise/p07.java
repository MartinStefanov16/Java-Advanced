package L04_Matrixes_Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class p07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);


        List<List<Integer>> matrix = new ArrayList<>();

        // initialize the ROW list in the first FOR loop
        String[] size = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        matrix = fillMatrix(matrix,rows,cols);
        // TODO - temp?
        printMatrix(matrix);
        matrix.get(0).set(0,0);
        printMatrix(matrix);

        String input = scanner.nextLine();
        while (!input.equals("nuke")){
            int targetRow = Integer.parseInt(input.split(" ")[0]);
            int targetCol = Integer.parseInt(input.split(" ")[1]);
            int explosionRadius = Integer.parseInt(input.split(" ")[2]);

            


            input = scanner.nextLine();
        }
    }



    private static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    private static List<List<Integer>> fillMatrix(List<List<Integer>> matrix, int rows, int cols) {

        int count = 1;
        for (int row = 0; row < rows; row++) {
            List<Integer> rowList = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                rowList.add(count++);
            }
            matrix.add(rowList);
        }

        return matrix;
    }


}
