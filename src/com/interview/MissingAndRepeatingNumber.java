package java.interview;

import java.util.*;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,1,5);
        System.out.println(repeatedNumber(integers));

    }
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> integers =  new ArrayList<>();
        Map<Integer,Boolean> numberMap= new HashMap<Integer,Boolean>();
        for(Integer value:A){
            if(numberMap.get(value)==null)
            {
                numberMap.put(value,true);
            }else{
                integers.add(value);
            }
        }
        for (int val=1;val < A.size();val++) {
            if(numberMap.get(val)==null){
                integers.add(val);
            }

        }


        return integers;
    }
}
