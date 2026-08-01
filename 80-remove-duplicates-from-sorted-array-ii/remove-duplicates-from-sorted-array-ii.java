class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        
        
for (int i = 2; i < nums.length; i++) {
    int current = nums[i];
    if (current != nums[k - 2]) {

        nums[k] = nums[i];
        k++;
    }
}

return k;
    }
}