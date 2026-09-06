class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        int count = 0;
        long totalSum = 0;
        long firstSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < half; i++) {
            firstSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            long secondSum = totalSum - firstSum;

            if (firstSum > secondSum) {
                count++;
            }

            firstSum -= nums[i];
            firstSum += nums[(i + half) % n];
        }

        return count;
    }
}
