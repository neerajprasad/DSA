package leetCode.array;

public class DivisionOfArrayExceptSelf {

    public static void main(String[] args) {
        for (int a:productExceptSelfothere(new int[]{1,0})
             ) {
            System.out.println(a);
        }
    }
    public  static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product=1;
        for (int num: nums) {
            product *=num;
        }
        int i=0;
        for (int num: nums) {
            int divison=0;
            int tempProduct=product;
            if(product!=0) {
                while (tempProduct != 0) {
                    tempProduct = tempProduct - num;
                    divison++;
                }
                result[i++] = divison;
            }
            else
            {
                if(num==0){
                    result[i++]=1;
                }else {
                    result[i++]=0;
                }
            }

        }
        return  result;
    }
    public static int[] productExceptSelfOther(int[] nums) {
        int[] result = new int[nums.length];

        result[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            result[i]=result[i+1]*nums[i+1];
        }

        int left=1;
        for(int i=0; i<nums.length; i++){
            result[i]=result[i]*left;
            left = left*nums[i];
        }

        return result;
    }

    public static int[] productExceptSelfothere(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];

        t1[0]=1;
        t2[nums.length-1]=1;

        //scan from left to right
        for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
        }

        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
        }

        //multiply
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }

        return result;
    }
}