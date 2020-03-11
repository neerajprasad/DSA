package interview.array;

public class MinJump {


    //    1,2,3,4,5,6
    public static int minJumpUtil(int[] arr) {
        int n = arr.length;
        int jumps[] = new int[n]; // jumps[n-1] will hold the
        // result
        int i, j;
        if(n==1)
            return 0;
        if ( arr[0] == 0)
            return -1; // if first element is 0,
        // end cannot be reached

        jumps[0] = 0;

        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1];
//        if (steps.length == 0)
//            return 0;
//        if (steps.length == 1) {
//            return steps[0];
//        }
//        int stepCount = 0;
//        for (int i = 0; i < steps.length; i++) {
//            int maxValue = Integer.MIN_VALUE;
//
//            for (int j = 1; j <= steps[i]; j++) {
//                if ((i + j) < steps.length && steps[i + j] > maxValue) {
//                    maxValue = steps[i + j];
//                    i = i + j;
//                    stepCount++;
//                }else {
//                    return 0;
//                }
//            }
//
//        }
//        return stepCount;
    }
}
