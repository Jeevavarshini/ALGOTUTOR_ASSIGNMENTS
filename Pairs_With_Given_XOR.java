import java.util.HashMap;

public class Solution {
    public static int countPairsWithXOR(int[] nums, int targetXOR) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int complement = targetXOR ^ num;
            if (complementMap.containsKey(complement)) {
                count += complementMap.get(complement);
            }
            complementMap.put(num, complementMap.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int targetXOR = 6;
        int result = countPairsWithXOR(nums, targetXOR);
        System.out.println(result);
    }
}

