package leetCode.array;

public class MaximunSumArray {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int tempSum=0;

        for (int i = 0; i <nums.length ; i++) {
            tempSum +=nums[i];
            if(tempSum>maxSum){
                maxSum=tempSum;
            }
            if(tempSum<0){
                tempSum=0;
            }
        }


        return maxSum;
    }
}
