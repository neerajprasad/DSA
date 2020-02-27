package interview;

import java.util.Arrays;
import java.util.List;

public class MainAapp {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(12, 11);
//        System.out.println(rotateArray(a, 3));
//        Integer[][] val = {{1, 2, 3 },{4, 5, 6 },{7, 8, 9}};
//        List<List<Integer>> spiralOrder1 = Arrays.stream(val).interview.map(Arrays::asList).collect(Collectors.toList());;
//        System.out.println(spiralOrder(spiralOrder1));
        System.out.println(countInversions(a));
    }

    public static int countInversions(List<Integer> A) {
        int result = 0;

        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) > A.get(j) && i < j) {
                    result++;

                }
            }
        }
        return result;
    }
}
