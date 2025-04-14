package problemSolving;

public class Zero {
    public void swap(int nums[],int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;


    }
    public void moveZeroes(int nums[]) {
        int i = 0;
        for(int j=0;j<nums.length; j++ ) {
            if(nums[j] != 0) {
                swap(nums,i,j);
                i++;
            }
        }

    }
    public static void main(String[] args) {
        int nums[] = {1,2,0,3,0,12};
        Zero zero = new Zero();
        zero.moveZeroes(nums);
        for(int num : nums) {
            System.out.print(num + " "); 
        }


    }
}
