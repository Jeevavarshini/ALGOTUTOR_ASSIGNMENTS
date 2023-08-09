public class RowToColumnZero {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        convertRowToColumnZero(matrix);

        System.out.println("Matrix after converting rows to columns with zeros:");
        displayMatrix(matrix);
    }

    public static void convertRowToColumnZero(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        boolean[] rowHasZero = new boolean[rows];
        boolean[] columnHasZero = new boolean[columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == 0) {
                    rowHasZero[i] = true;
                    columnHasZero[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (rowHasZero[i]) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < columns; j++) {
            if (columnHasZero[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
