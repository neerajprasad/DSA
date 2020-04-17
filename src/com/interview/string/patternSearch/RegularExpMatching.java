package interview.string.patternSearch;

public class RegularExpMatching {
    public static boolean isMatch(String s, String p) {
        if(s==null) return false;
        int counter=0;
        for(char c:p.toCharArray()){
            if(c=='*'){
                while(counter<s.length()-1&&s.charAt(counter++)==s.charAt(counter++));
            }else if(c=='+')
            {
//                if(counter<s.length() &&s.charAt(counter)==s.charAt(counter-1)){
                    counter++;
//                }
            }else{
                if(counter<s.length() && c==s.charAt(counter)) counter ++;
            }
        }
        return s.length()==counter;
    }
}