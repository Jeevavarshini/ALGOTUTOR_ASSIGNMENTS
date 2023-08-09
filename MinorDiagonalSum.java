public class MinorDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = findMinorDiagonalSum(matrix);

        System.out.println("Sum of elements along the minor diagonal: " + sum);
    }

    public static int findMinorDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][n - 1 - i];
        }

        return sum;
    }
}
