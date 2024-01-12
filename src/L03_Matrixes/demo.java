package L03_Matrixes;

public class demo {
    public static void main(String[] args) {

        //Initializing

        int[][] matrix = {
                {1,2,3},
                {1,2,3},
        };

        // Printing

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
