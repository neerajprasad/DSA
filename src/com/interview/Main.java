package java.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String NAME_PATTERN = "^[\\s]*[a-zA-Z]+[\\.]?([a-zA-Z\\s]+[\\.]?)*$";
    private static final Pattern namePattern = Pattern.compile(NAME_PATTERN);

    public static void main(String args[]) {
        System.out.println(validateName("Āshikh"));
    }

    public static boolean validateName(String str) {
        if (isBlank(str))
            return false;

        Matcher matcher = namePattern.matcher(str);
        return matcher.matches();
    }



    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
}