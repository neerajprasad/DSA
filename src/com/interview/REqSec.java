package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class REqSec {
    public static void main(String[] args) {
        System.out.println(droppedRequests(Arrays.asList(1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11)));
    }

    public static int droppedRequests(List<Integer> array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int[] secValue = new int[array.size()];
        int result = 0;
        int count3 = 0;
        int currentIndex = 0;
        int count60 = 0;
        int secCount = 0;

        for (int i = 0; i < array.size(); ) {
            // 3 sec condition
            int currentValue = array.get(i);

            count3 = 0;
            while (i < array.size()-1 && array.get(i) == array.get(i + 1) && count3 <= 3) {
                count3++;
                currentIndex=i;
                i++;
            }
            while (i < array.size() && currentValue == array.get(i)) {
                currentIndex=i;
                result++;
                count3++;
                i++;

            }
            secValue[secCount++] = array.get(currentIndex);
            countMap.put(currentValue, count3);
            // 10 sec condition max 20 req
            if (currentValue > 10) {
                int total20Count = 0;
                for (int j = secValue[secCount-2]; j > (currentValue - 9); j--) {
                    total20Count += countMap.get(j);
                }
                result += total20Count > 20 ? total20Count - 20 : 0;

            }
            if (currentValue > 60) {
                int total60Count = 0;
                for (int j = secValue[secCount-2]; j > (currentValue - 60); j--) {
                    total60Count += countMap.get(j);
                }
                result += total60Count > 60 ? total60Count - 60 : 0;

            }

        }
        return result;
    }
}
