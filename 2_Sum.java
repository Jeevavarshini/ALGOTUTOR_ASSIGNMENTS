import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<List<Integer>> findPairsWithSum(int[] nums, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int num : nums) {
            int complement = targetSum - num;
            if (complementMap.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(num);
                pair.add(complement);
                result.add(pair);
            }
            complementMap.put(num, complement);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int targetSum = 7;
        List<List<Integer>> pairs = findPairsWithSum(nums, targetSum);
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
