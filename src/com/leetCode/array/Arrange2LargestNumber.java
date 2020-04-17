package leetCode.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Arrange2LargestNumber {
    public String largestNumber(final List<Integer> A) {
        StringBuilder result=new StringBuilder();
        List<String> newValues = new LinkedList<>();
        for (Integer val:A ) {
            newValues.add(String.valueOf(val));
        }
        Collections.sort(newValues,(a,b)->(b+a).compareTo(a+b));
        newValues.stream().forEach(a->  result.append(a));
        if(result.charAt(0)=='0'){
            return String.valueOf(0);
        }
        return result.toString();
    }
}
