import java.util.HashSet;

public class Solution {
    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestSequence = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentSequence = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSequence++;
                }
          longestSequence = Math.max(longestSequence, currentSequence);
            }
        }
        return longestSequence;
    }
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2, 5};
        int result = longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + result); 
    }
}
