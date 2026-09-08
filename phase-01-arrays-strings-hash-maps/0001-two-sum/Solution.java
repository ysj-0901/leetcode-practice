import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>(); // number -> index

        for (int i = 0; i < nums.length; i++) {       
            int num = nums[i];
            int complement = target - num;

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            //if complement doesn't exist in seen, put the current key and value in seen
            seen.put(num, i);
        }

        // LeetCode guarantees a solution exists, so this won't happen.
        return new int[] {-1, -1};
    }
}
