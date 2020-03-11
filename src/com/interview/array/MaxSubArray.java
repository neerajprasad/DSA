package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSubArray {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList( 336465782, -278722862, -2145174067, 1101513929, 1315634022, -1369133069, 1059961393, 628175011, -1131176229, -859484421);
        System.out.println(maxset(A));
    }





    public static ArrayList<Integer> maxset(List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        int minIndex = -1;
        int maxIndex = 0;
        long maxSum = 0;
        long tempSum = 0;
        for (int i = 0; i < A.size(); i++) {

            if (A.get(i) >= 0) {
                tempSum += A.get(i);
                if (tempSum >= 0 && minIndex==-1) minIndex = i;
            } else {
                if (tempSum >= maxSum && minIndex >=0) {
                    result = new ArrayList<>();
                    for (int ii = minIndex; ii <= maxIndex; ii++) {
                        result.add(A.get(ii));
                    }
                }
                tempSum = 0;
                minIndex = -1;
            }

            if (tempSum >= maxSum) {
                maxSum = tempSum;
                maxIndex = i;
            }
        }
        if (tempSum >0 && tempSum >= maxSum && minIndex >=0){
            result = new ArrayList<>();
            for (int ii = minIndex; ii <= maxIndex; ii++) {
                result.add(A.get(ii));
            }
        }


        return result;

    }

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || ((maxSum == newSum) && (newArray.size() > maxArray.size()))) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}
