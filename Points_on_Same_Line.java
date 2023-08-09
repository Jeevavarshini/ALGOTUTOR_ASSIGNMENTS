public class Solution {
    public static boolean checkStraightLine(int[][] points) {
        if (points.length <= 2) {
            return true;
        }
        int[] point1 = points[0];
        int[] point2 = points[1];
        int xDiff = point2[0] - point1[0];
        int yDiff = point2[1] - point1[1];
        for (int i = 2; i < points.length; i++) {
            int[] currentPoint = points[i];
            int currentXDiff = currentPoint[0] - point1[0];
            int currentYDiff = currentPoint[1] - point1[1];
            if (xDiff * currentYDiff != yDiff * currentXDiff) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] points1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int[][] points2 = {{1, 2}, {2, 3}, {3, 4}, {5, 6}};
        System.out.println(checkStraightLine(points1));
        System.out.println(checkStraightLine(points2)); 
    }
}

