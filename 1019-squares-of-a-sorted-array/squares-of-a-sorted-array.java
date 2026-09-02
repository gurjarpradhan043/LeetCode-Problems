class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        
        int left = 0;
int right = nums.length - 1;
int k = ans.length - 1;

    while (left <= right) {
        int leftSquare = nums[left] * nums[left];
int rightSquare = nums[right] * nums[right];
        if (leftSquare >  rightSquare ) {
    ans[k] = nums[left] * nums[left];
    left++;
    k--;
} else {
    ans[k] = nums[right] * nums[right];
    right--;
    k--;
}
    }
//return ans
     return ans;
    }
}
