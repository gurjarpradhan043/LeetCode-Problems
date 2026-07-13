class Solution {
    public int[] shuffle(int[] nums, int n) {
        int finalArray[] = new int[nums.length];
        int firstGroup[] = new int[n];
        int secondGroup[] = new int[n];

        for (int i = 0; i < nums.length ; i++) {
            if (i < n) {
               firstGroup[i] = nums[i];
           } else {
                secondGroup[i-n] = nums[i];
           }
        }
        for (int i = 0; i < firstGroup.length; i++) {
                finalArray[i * 2] = firstGroup[i];
                finalArray[i * 2 + 1] = secondGroup[i];
                
        }
        return finalArray;
        
    }
}