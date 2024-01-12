package L04_Matrixes_Excercise;

public class rotateMatrixHowTo {
    public static void main(String[] args) {

        // INSTRUCTIONS
        // the 3 ints below are adjustments, rest is automatic
        // rotation is CLOCKWISE by 90 degrees per rotation
        int rotations = 1;
        int rows = 2;
        int cols = 3;

        int[][] matrix = fillMatrix(rows,cols);

        System.out.println("Original matrix");
        printMatrix(matrix);
        System.out.println();

       // int[][] matrix = new int[rows][cols];

        switch (rotations){
            case 1:
                matrix = rotate90(matrix, cols, rows);
                break;
            case 2:
                matrix = rotate90(matrix, cols, rows);
                matrix = rotate90(matrix, rows, cols);
                break;
            case 3:
                matrix = rotate90(matrix, cols, rows);
                matrix = rotate90(matrix, rows, cols);
                matrix = rotate90(matrix, cols, rows);
                break;
        }

        System.out.println("Rotated matrix");
        printMatrix(matrix);

    }

    private static int[][] rotate90(int[][] matrix, int rows, int cols) {
        int[][] newMatrix = new int[rows][cols];

        for (int row = 0; row < newMatrix.length; row++) {
            int counter = matrix.length - 1;
            for (int col = 0; col < newMatrix[row].length; col++) {
                newMatrix[row][col] = matrix[counter--][row];
            }
        }
        return newMatrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];

        int counter = 1;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = counter++;
            }
        }
        return matrix;
    }
}
