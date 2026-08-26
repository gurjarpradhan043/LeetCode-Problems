class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxLen  = 0;

        for (int num : nums) {
    set.add(num);
}

        for (int num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int length = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                maxLen = Math.max(maxLen,length);
            }
        }
        return maxLen;
    }
}