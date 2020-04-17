package leetCode.array;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MovesZeroAtEnd {

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for (int val:nums) {
            System.out.println(val);
        }


    }
    public static void moveZeroes(int[] nums) {
        if( nums.length<=1) return;
        int currentIndex=0;
        for (int i = 0; i <nums.length ;i++) {
            if(nums[i]!=0){
                swapValue(currentIndex++, i , nums);
//                if (currentIndex==0 )currentIndex=i;
//                while(i+1< nums.length&&nums[i+1]==0){
//                    i++;
//                }
//                if(i+1< nums.length) {
//
//                    currentIndex++;


//                }
            }
        }

    }

    private static void swapValue(int currentIndex, int i, int[] nums) {
        int temp = nums[currentIndex];
        nums[currentIndex]=nums[i];
        nums[i]=temp;
    }
}
