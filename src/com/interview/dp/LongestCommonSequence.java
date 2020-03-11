package interview.dp;

import java.util.ArrayList;

public class LongestCommonSequence {
    public int lisCount(int[] sequenceArray) {
        int[] lis = new int[sequenceArray.length];
        int[] lds = new int[sequenceArray.length];
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < sequenceArray.length; i++) {
            lis[i] = 1;
            lds[i]=1;
        }
        for (int i = 1; i < sequenceArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequenceArray[i] > sequenceArray[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }

            }

        }
        for (int i = sequenceArray.length-2; i >=0 ; i--) {
            for (int j = sequenceArray.length-1; j > i; j--) {
                if (sequenceArray[i] > sequenceArray[j] && lds[i] < lds[j] + 1) {
                    lds[i] = lds[j] + 1;
                }

            }

        }

        for (int i = 0; i < sequenceArray.length; i++)
            if (lis[i] + lds[i] -1 > max)
                max = lis[i] + lds[i] -1;
        return max;
    }
    public int lisCount(ArrayList<Integer> A) {
        int[] lis = new int[A.size()];
        int[] lds = new int[A.size()];
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < A.size(); i++) {
            lis[i] = 1;
            lds[i] = 1;
        }
        for (int i = 1; i < A.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (A.get(i) > A.get(j) && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }

            }

        }

        for (int i = A.size()-2; i >=0 ; i--) {
            for (int j = A.size()-1; j > i; j--) {
                if (A.get(i) > A.get(j) && lds[i] < lds[j] + 1) {
                    lds[i] = lds[j] + 1;
                }

            }

        }

        for (int i = 0; i <A.size() ; i++) {
            max=Math.max(max,(lis[i]+lds[i] -1));
        }
        return max;
    }

}
