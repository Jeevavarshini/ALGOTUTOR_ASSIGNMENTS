import java.util.ArrayList;
import java.util.List;

public class AntiDiagonals {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        List<List<Integer>> antiDiagonals = findAntiDiagonals(matrix);

        System.out.println("Anti-Diagonals of the matrix:");
        for (List<Integer> diagonal : antiDiagonals) {
            System.out.println(diagonal);
        }
    }

    public static List<List<Integer>> findAntiDiagonals(int[][] matrix) {
        List<List<Integer>> antiDiagonals = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            List<Integer> diagonal = new ArrayList<>();

            int row = i;
            int col = columns - 1;
            while (row >= 0 && col >= 0) {
                diagonal.add(matrix[row][col]);
                row--;
                col--;
            }

            antiDiagonals.add(diagonal);
        }

        for (int i = 1; i < columns; i++) {
            List<Integer> diagonal = new ArrayList<>();

            int row = rows - 1;
            int col = i;
            while (row >= 0 && col >= 0) {
                diagonal.add(matrix[row][col]);
                row--;
                col--;
            }

            antiDiagonals.add(diagonal);
        }

        return antiDiagonals;
    }
}


