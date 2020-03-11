package interview.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestRectangleWithPermutations {
    public static void main(String[] args) {
        Integer[][] M = {{0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}};

        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();

        for (int i = 0; i < M.length; i++) {
            List<Integer> integers = new ArrayList<>();
            for (int j = 0; j < M[i].length; j++) {
                integers.add(M[i][j]);
            }
            arrayLists.add((ArrayList<Integer>) integers);
        }

        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(Arrays.toString(arrayLists.get(i).toArray()));
        }



        System.out.println(LargestRectangle(arrayLists));
    }

    private static int LargestRectangle(ArrayList<ArrayList<Integer>> A) {
        int result = 0;
//        dp progamming variable
        ArrayList<ArrayList<Integer>> lrp = new ArrayList<>();
        if(A.isEmpty()){
            return result;
        }
        for (int i = 0; i <A.size() ; i++) {
           lrp.get(i).add(A.get(i).get(0));
        }
        for (int i = 0; i <A.get(0).size() ; i++) {
            lrp.get(0).add(A.get(0).get(i));
        }



        return result;
    }

}

