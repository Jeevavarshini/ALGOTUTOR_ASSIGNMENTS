import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] customSort(int[] A, int[] B) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(A, (a, b) -> {
            if (frequencyMap.containsKey(a) && frequencyMap.containsKey(b)) {
                return Integer.compare(BToOrder(B, a), BToOrder(B, b));
            }
            else if (frequencyMap.containsKey(a)) {
                return -1;
            } else if (frequencyMap.containsKey(b)) {
                return 1;
            }
            else {
                return Integer.compare(a, b);
            }
        });
        return A;
    }
    private static int BToOrder(int[] B, int num) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] A = {2, 1, 2, 5, 7, 1, 9, 3};
        int[] B = {2, 1, 3};
        int[] result = customSort(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
