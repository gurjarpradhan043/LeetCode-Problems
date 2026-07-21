class Solution {
    public int removeDuplicates(int[] nums) {
      int k = 1;
        nums[0] = nums[0];
        for ( int i = 0; i < nums.length -1; i++) {
           int j = i + 1;
            if ( nums[i] != nums[j]) {
                    nums[k] = nums[j];
                    k++;
            }
        }
            return k;
        }      
    }