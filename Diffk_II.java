import java.util.HashMap;
public class Solution {
    public static boolean hasPairWithDifference(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i] - k) || map.containsKey(arr[i] + k)) {
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 10};
        int k = 2;
        System.out.println(hasPairWithDifference(arr, k)); 
    }
}

