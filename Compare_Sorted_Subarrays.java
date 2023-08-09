public class Solution {
    public static boolean hasPairWithSum(int[] A, int[] B, int k) {
        int ptrA = 0; 
        int ptrB = B.length - 1;

        while (ptrA < A.length && ptrB >= 0) {
            int sum = A[ptrA] + B[ptrB];
            if (sum == k) {
                return true; 
            } else if (sum < k) {
                ptrA++;
            } else {
                ptrB--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8};
        int k = 10;
        System.out.println(hasPairWithSum(A, B, k)); 
    }
}

