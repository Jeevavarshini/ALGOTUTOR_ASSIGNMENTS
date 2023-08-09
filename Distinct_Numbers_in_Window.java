import java.util.HashMap;

public class Solution {
    public static int[] countDistinctElementsInWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length) {
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        HashMap<Integer, Integer> windowElements = new HashMap<>();
        for (int i = 0; i < k; i++) {
            windowElements.put(nums[i], windowElements.getOrDefault(nums[i], 0) + 1);
        }
        result[0] = windowElements.size();
        for (int i = k; i < nums.length; i++) {
            int leftElement = nums[i - k];
            int rightElement = nums[i];
            if (windowElements.get(leftElement) == 1) {
                windowElements.remove(leftElement);
            } else {
                windowElements.put(leftElement, windowElements.get(leftElement) - 1);
            }
            windowElements.put(rightElement, windowElements.getOrDefault(rightElement, 0) + 1);
            result[i - k + 1] = windowElements.size();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        int[] result = countDistinctElementsInWindow(nums, k);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
