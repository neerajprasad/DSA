package java.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(11,12);
//        System.out.println(rotateArray(a, 3));
//        Integer[][] val = {{1, 2, 3 },{4, 5, 6 },{7, 8, 9}};
//        List<List<Integer>> spiralOrder1 = Arrays.stream(val).interview.map(Arrays::asList).collect(Collectors.toList());;
//        System.out.println(spiralOrder(spiralOrder1));
        System.out.println(countInversions(a));
    }
    public static int countInversions(List<Integer> A) {
        int count=0;
        int result=0;
        for (Integer value:A){
            int j=count+1;
            while(A.get(count)>A.get(j) && count<j){
                result++;
            }
            count++;
        }
        return result;
    }
    // 1 2 3 4 5
    public static ArrayList<Integer> rotateArray(List<Integer> A, int k) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (A.isEmpty())
            return ret;
//        k=k%A.size();
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (count == A.size())
                break;
            int currValue = i + k;
            if (currValue == A.size() - 1) {
                i = i - A.size();
            }
            count++;
            ret.add(A.get(currValue));
        }
//        ret.add(A.get(A.size()-1 + B));
        return ret;
    }

    public static ArrayList<Integer> spiralOrder(final List<List<Integer>> A) {
        ArrayList<Integer> integers = new ArrayList<>();
        int top = 0;

        int bottom = A.size()-1;
        int left = 0;
        int right = A.get(0).size()-1;
        int dir=0;

        while(top<=bottom && left <= right){
            switch (dir){
                case 0:
                    for(int i=left;i<=right;i++){
                        integers.add(A.get(top).get(i));
                    }
                    top++;
                    break;
                case 1:
                    for(int i=top;i<=bottom;i++){
                        integers.add(A.get(i).get(right));
                    }
                    right--;
                    break;
                case 2:
                    for(int i=right;i>=left;i--){
                        integers.add(A.get(bottom).get(i));
                    }
                    bottom --;
                    break;
                case 3:
                    for(int i=bottom;i>=top;i--){
                        integers.add(A.get(i).get(left));
                    }
                    left ++;
                    break;
            }
            dir =(dir+1)%4;
        }



        return integers;
    }
//      1 2 3 4 5 6
    public  static int maxSubArray(final List<Integer> A) {
        int maxSum=0;
        int maxSumSoFar=Integer.MIN_VALUE;
        for(Integer value : A){
            maxSum += value;
            maxSumSoFar = maxSumSoFar < maxSum ?maxSum:maxSumSoFar;

            maxSum = maxSum <0 ?0 :maxSum;

        }
return maxSumSoFar;
    }
}
