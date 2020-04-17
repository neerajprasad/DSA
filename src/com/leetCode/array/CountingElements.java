package leetCode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountingElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        int count = 0;
        Set<Integer> integerSet = IntStream.of(arr).boxed().collect(Collectors.toSet());
        for (int j = 0; j <arr.length; j++) {
            if(integerSet.contains(arr[j]+1)){
                count++;
            }
        }
        return count;
    }
}
