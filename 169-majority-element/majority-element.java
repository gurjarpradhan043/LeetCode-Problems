class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0 ;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums.length-1  == 0 ) {
                candidate = nums[i];
                } else {

                if ( count == 0 || count == 1 ) {
                candidate = nums[i];
                count = 1;
              }
                 if (candidate == nums[i]) {
                    count++;
                } else {
                    count --;
                }
           
            }
            
        }
        return candidate;
    }
 }