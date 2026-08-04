class Solution {
    void reverse(int[] nums, int left, int right) {
        while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length -1 ;
        int start = 0;
        int end = 0;
        k = k % nums.length;

        //reversing 
        start = 0;
        end = nums.length - 1;
        reverse(nums, start, end);
        

        //first group
        start = 0;
        end = k-1;
        reverse(nums, start, end);
    
        //second group
        start = k;
        end = nums.length - 1;
        reverse(nums, start, end);
        
        System.out.print(Arrays.toString(nums));
    }
}


