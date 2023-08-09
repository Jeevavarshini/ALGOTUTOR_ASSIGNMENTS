public class RowSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[] rowSums = findRowSums(matrix);

        System.out.println("Row Sums of the matrix:");
        for (int sum : rowSums) {
            System.out.println(sum);
        }
    }

    public static int[] findRowSums(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        return rowSums;
    }
}
