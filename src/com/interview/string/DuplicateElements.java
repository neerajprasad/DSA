package java.interview.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
        System.out.println(new DuplicateElements().solutionNS1(new int[]{1, 2, 3, 4, 5, 4}));

    }

    public int solutionN2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return 0;
    }

    public int solutionNLogN(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1])
                return arr[i];
        }
        return 0;
    }
    public int solutionNSN(int[] arr) {
        Map<Integer,Boolean> mapOfInteger = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(mapOfInteger.containsKey(arr[i]))
            {
                return arr[i];
            }else {
                mapOfInteger.put(arr[i],true);
            }
        }
        return 0;
    }
    public int solutionNS1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[Math.abs(arr[i])]<0){
                return Math.abs(arr[i]);
            }else {
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[(i)])];
            }
        }
        return 0;
    }


}
