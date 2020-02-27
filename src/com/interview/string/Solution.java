package java.interview.string;

import java.util.ArrayList;

public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        return commonPrefix(A.stream().toArray(n -> new String[n]));
    }
    private static String commonPrefix(String[] values) {
        if (values.length==0) return "";
        String prefix=values[0];
        for (int i=1;i<values.length-1;i++) {
            prefix = prefixUtil(prefix,values[i]);
        }
        return prefix;
    }

    private static String prefixUtil(String prefix, String value) {
        StringBuilder result= new StringBuilder();
        for(int i=0,j=0;i<prefix.length()-1&& j<value.length()-1;i++,j++){
            if(prefix.charAt(i)!=value.charAt(j)) break;
            result.append(prefix.charAt(i));
        }

        return result.toString();
    }
}
