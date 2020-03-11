package interview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 100);
        int[][] queries = new int[3][3];
//        queries[0][0]= new int[]{1, 2, 100};
        List<Integer> integer2 = Arrays.asList(2, 5, 100);
        List<Integer> integer3 = Arrays.asList(3, 4, 100);
        List<List<Integer>> cost = new ArrayList<>();
        cost.add(integer2);
        cost.add(integers);
        cost.add(integer3);
//        System.out.println(arrayManipulation(5,Arrays.asList(cost)));
    }
//    static long arrayManipulation(int n, int[][] queries) {
//
//
//    }
//
}
