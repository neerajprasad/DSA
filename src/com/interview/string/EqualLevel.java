package interview.string;

import java.util.Arrays;
import java.util.List;

public class EqualLevel {

    public static void main(String[] args) {
        List<Integer> signalOne = Arrays.asList(1,2,3,3,4);
        List<Integer> signalTwo = Arrays.asList(1,2,3,4,5);
        System.out.println(updateTimes(signalOne, signalTwo));
    }

    public static int updateTimes(List<Integer> signalOne, List<Integer> signalTwo) {
        int count = 0;
        int maxEqual = Integer.MIN_VALUE;

        for (int i = 0; i < signalOne.size(); i++) {
            int j = i;
            while (i < signalOne.size() && signalOne.get(i) == signalTwo.get(j)) {
                if (i > 0 && signalOne.get(i) > signalOne.get(i - 1))
                    count++;
                else if (i == 0 && signalOne.get(i) == signalTwo.get(j)) {
                    count++;
                } else {
                    break;

                }
                i++;
                j++;
            }
            if (maxEqual < count) {
                maxEqual = count;
            }
            count = 0;

        }
        return maxEqual;
    }
}
