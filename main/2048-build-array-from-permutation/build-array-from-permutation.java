class Solution {
   public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        int temp = 0;
        for(int i=0; i<= nums.length-1; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}