import java.util.HashMap;

public class Solution {
    public int solve(int[] A) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int minDistance = 1_000_000_000;
        int previousIndex = 0;
        int currentIndex = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (hmap.containsKey(A[i])) {
                currentIndex = i;
                previousIndex = hmap.get(A[i]);
                minDistance = Math.min(currentIndex - previousIndex, minDistance);
            }
            
            hmap.put(A[i], i);
        }
        
        if (minDistance == 1_000_000_000) {
            return -1;
        }
        return minDistance;
    }
}
