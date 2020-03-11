package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MaxAbsDifference {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(1,3,-1 );
        System.out.println(maxArr( A));
    }

    public static int maxArr(List<Integer> A) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            max1=Math.max(max1,A.get(i)+i);
            min1=Math.min(min1,A.get(i)+i);
            max2=Math.max(max2,A.get(i)-i);
            min2=Math.min(min2,A.get(i)-i);
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++){
            ans=Math.max(ans,Math.abs(max1-(A.get(i)+i)));
            ans=Math.max(ans,Math.abs(min1-(A.get(i)+i)));
            ans=Math.max(ans,Math.abs(max2-(A.get(i)-i)));
            ans=Math.max(ans,Math.abs(min2-(A.get(i)-i)));
        }
        return ans;
    }


}
