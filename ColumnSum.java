public class ColumnSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] columnSums = findColumnSums(matrix);

        System.out.println("Column Sums of the matrix:");
        for (int sum : columnSums) {
            System.out.println(sum);
        }
    }

    public static int[] findColumnSums(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] columnSums = new int[columns];
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            columnSums[j] = sum;
        }

        return columnSums;
    }
}


