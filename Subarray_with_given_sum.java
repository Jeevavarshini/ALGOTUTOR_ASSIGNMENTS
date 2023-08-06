import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Integer> findSubarrayWithTargetSum(int[] nums, int targetSum) {
        List<Integer> subarray = new ArrayList<>();
        int left = 0;
        int right = 0;
        int currentSum = 0;
        while (right < nums.length) {
            currentSum += nums[right];
            while (currentSum > targetSum) {
                currentSum -= nums[left];
                left++;
            }
           if (currentSum == targetSum) {
                for (int i = left; i <= right; i++) {
                    subarray.add(nums[i]);
                }
                break;
            }
            right++;
        }
        return subarray;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;
        List<Integer> subarray = findSubarrayWithTargetSum(nums, targetSum);
        System.out.println(subarray);
    }
}

