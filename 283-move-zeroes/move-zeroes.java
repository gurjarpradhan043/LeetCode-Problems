class Solution {
    public  void moveZeroes(int[] nums) {
        int usedIndex = 0;
        int ans[] = new int[nums.length];

        for ( int i = 0; i < nums.length; i++ ) {
            if (nums[i] != 0 ) {
                ans[usedIndex] = nums[i];
                usedIndex++;
            } 
        }
            for (int j = usedIndex; j < ans.length; j++) {
                ans[j] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}