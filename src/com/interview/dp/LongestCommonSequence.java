package interview.dp;

import java.util.ArrayList;

public class LongestCommonSequence {
    public int lisCount(int[] sequenceArray) {
        int[] lis = new int[sequenceArray.length];
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < sequenceArray.length; i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < sequenceArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sequenceArray[i] > sequenceArray[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }

            }

        }
        for (int i = 0; i <sequenceArray.length ; i++) {
            max=Math.max(max,lis[i]);
        }
        return max;
    }
    public int lisCount(ArrayList<Integer> sequenceArray) {
        int[] lis = new int[sequenceArray.size()];
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < sequenceArray.size(); i++) {
            lis[i] = 1;
        }
        for (int i = 1; i < sequenceArray.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (sequenceArray.get(i) > sequenceArray.get(j) && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }

            }

        }
        for (int i = 0; i <sequenceArray.size() ; i++) {
            max=Math.max(max,lis[i]);
        }
        return max;
    }

}
