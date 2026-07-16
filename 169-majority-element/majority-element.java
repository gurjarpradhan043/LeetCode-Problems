class Solution {
    public int majorityElement(int[] nums) {
        int currentNumber ;
        
        int n = nums.length;
        int half = n / 2;
        int number = 0 ;

        

        for (int i = 0; i < n; i++) {
            if (n-1 == 0){
                number = nums[i];
                return number;
            } else {
            int count = 1;
            
            currentNumber = nums[i]; 
            
            
            for ( int j = i + 1; j < n; j++) {

               if (currentNumber == nums[j]) {
                    count++;
                }

                if (count > half) {
                       number = currentNumber;
                       break;
                }
            }
              
            }
        }
            return number;

    } 
 }