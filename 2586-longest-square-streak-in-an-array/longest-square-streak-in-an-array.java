import java.util.*;

class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);

        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 1;

        for (int num : nums) {
            int len = 1;

            int root = (int) Math.sqrt(num);
            if (root * root == num && dp.containsKey(root)) {
                len = dp.get(root) + 1;
            }

            dp.put(num, Math.max(dp.getOrDefault(num, 0), len));
            ans = Math.max(ans, dp.get(num));
        }

        return ans >= 2 ? ans : -1;
    }
}