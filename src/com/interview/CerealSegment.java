package interview;

import java.util.List;

public class CerealSegment {
    public static int segment(int x, List<Integer> arr) {
            int maxValue = Integer.MAX_VALUE;
            int[] minValue = new int[arr.size() + 1];
            int j = 0;
            for (int i = 0; i+x <= arr.size(); i++) {
                int tempCount = 0;
                while (tempCount + i < arr.size() && tempCount < x) {
                    maxValue = Math.min(maxValue, arr.get(tempCount + i));
                    tempCount++;
                }
                minValue[j++] = maxValue;
                maxValue=Integer.MAX_VALUE;
            }

            maxValue = 0;
            for (int value : minValue) {
                if (value >= maxValue) {
                    maxValue = value;
                }
            }
            return maxValue;
    }
}
