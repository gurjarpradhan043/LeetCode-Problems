class Solution {
    public boolean check(int[] nums) {
         int b = 0;
         int n = nums.length;

         for ( int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % n] ) {
                b ++;
            }
         }

         if ( b > 1) {
            return false;
         } else {
            return true;
         }
    }
}