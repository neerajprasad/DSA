package interview.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NMaxPAirCombination {
    public static void main(String[] args) {
        int N = 4;
        Integer a[]={3, 2, 4, 2};
        Integer b[]={4, 3, 1, 2};

        ArrayList<Integer> result = solve(Arrays.asList(a),Arrays.asList(b));
result.stream().forEach(aa-> System.out.println(aa));
//        for (int i = 0; i < N; i++) {
//            System.out.println(result..get(i));
//
//        }
    }
   static public ArrayList<Integer> solve(List<Integer> A, List<Integer> B) {
       ArrayList<Integer> integers = new ArrayList<>();
       if(A.size() <=0 || A.size()!=B.size() ){
           return integers;
       }
       Collections.sort(A);
       Collections.reverse(A);
       Collections.sort(B);
       Collections.reverse(B);
       for(int i=0;i< A.size();i++){
           for(int j=0;j<B.size();j++){
               integers.add(A.get(i)+B.get(j));
           }
       }
       ArrayList<Integer> integers1 = new ArrayList<>();
       Collections.sort(integers);
       Collections.reverse(integers);
       for (int i = 0; i < A.size(); i++) {
           integers1.add(integers.get(i));
       }
       integers.removeAll(integers);
       return integers1;

   }
}
