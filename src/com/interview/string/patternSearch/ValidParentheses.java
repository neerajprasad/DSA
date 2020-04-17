package interview.string.patternSearch;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }

    public static boolean isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] countChar = new char[6];

        int counter = 0;
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            countChar[counter++] = c;
        }
        boolean result = true;
        for (int i = 0; i < 6; i++) {
            if (countChar[i] == '[' || countChar[i] == ']') {
                if (!map.getOrDefault('[', 0).equals(map.getOrDefault(']', 0))) {
                    result = false;
                }
            }
            if (countChar[i] == '{' || countChar[i] == '}') {
                if (!map.getOrDefault('{', 0).equals(map.getOrDefault('}', 0))) {
                    result = false;
                }
            }
            if (countChar[i] == '(' || countChar[i] == ')') {
                if (!map.getOrDefault('(', 0).equals(map.getOrDefault(')', 0))) {
                    result = false;
                }
            }
        }

        return result;
    }
}
