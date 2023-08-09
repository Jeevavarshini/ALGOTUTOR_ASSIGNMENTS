public class MainDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = findMainDiagonalSum(matrix);

        System.out.println("Sum of elements along the main diagonal: " + sum);
    }

    public static int findMainDiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
