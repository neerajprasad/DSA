package interview.string;

import java.util.regex.Pattern;

public class ValidNumber {
    public static void main(String[] args) {
        String A = "-1";
        System.out.println(validNumberUtil(A));
    }

    public static int validNumberUtil(String a) {
        a=a.trim();
        Pattern pattern = Pattern.compile("\\s*[-+]?[0-9]?.?[0-9]+(e[-+]?[0-9]+)?\\s*");

        if(pattern.matcher(a).matches()){
            return 1;
        }else {

            return 0;
        }
    }
}

