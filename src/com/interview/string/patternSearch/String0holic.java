package java.interview.string.patternSearch;

import java.util.*;

public class String0holic {

    public static void main(String[] args) {
        Map<String, Integer> result = new HashMap<>();
        List<String> A = Arrays.asList("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "babaaaabbaba", "baaaaababaabbaaaaabbbbbbbaabbaaaababbabaababaabaaabbbaaaaa", "abaabb", "aababbbbabbaaaabbaaaaaaaababbbabbbbaabbaabaabbaabaababbbababaababaabbababaaabaaaab", "babaaaaababbbbbabbbbabbaaabaaaababbabbaabbbabbaaaabbbabaaaabaaaababb", "bbbbbbaaaaaabbbbbbababaabaabbbbbaaabbabbaabbbbaaaaaababbabaaabbabbabbbabbaabbabbbbaabbbaaaaabbabaaab", "aabaaabaabbbbababbabbabaaaababbababbbabbbbaabbaaaaababbbbbababbbbaaababababab", "aaaababbbaabbbabaabb", "ababaaaabbabbbbaaabbababbbabbbabaaa", "aaabaabbbabaa", "baababbababbbbbabbabaabbabbbbbaaaabaaaababaa", "babaa", "abbabababbbbbbbbbbbaaaaaababbababaaabbbaaaabbbababbabaabbaabbbbaabbbaabbababababaabaaabbaaabbba", "ababbaabbaaabbbabaabababbbabaaabbbaababaaa", "abbaaaababbbbaaabaaaabaaaaabaababbabbaababbbabbbbbbbbbabbaabaaabbaaababbbaa", "bbabababaabbabbabbbabbaababbabaaabbbababab", "abbbaaabaab", "bbaaabbaaabbaabbabababa", "aabaabaaaaaaabaabbbaaababbbbbbababbaabababbaaaaabbabbbabbbaababbaabababbbbbbbbbaabaab", "babbaaabbabbaabaaabbb", "bbabaabba", "baabaaaaabbaaaaaabbbbaaaabababa", "babbaababaaba", "baabaabaabbababbaabbabbbbbabaaaabbbbbabbabbbbbabbbabaabbbbabbbbaaabbbbabababaaaababbaaabbabb", "abbbbaaaabaabbabbaababaabbababbbaaabbabbbbbaaabbabbaabbb", "bababaaaaabababbabbaabababbbaabbaabaabaabbabbbababbaaabababbababbbb", "abaaabbbabbbaabba", "bbbbaaaabbbababaabbbababaaaababbaaaaaabbbabbaababababbba", "bababaabaaaabbaabbababbaabbaabaabbaaaaaaaababbaaaaaabbaaabaabaaababbababbbbaabbabbabaabab", "aabbbabaaabababaabbbbaabbabaaabbbaaabbabbbbabaabbbbaabbbaaaaabbbabbbbb", "aabbbbbbabaabbbabbaababbababaabaaababbbbabbbaababaaaabbaaabaaabaaaabbbabababbab", "abaaaaababbabaabbbaaaaabbaaaabaaaaaaaababbaabbbaabbabbbabbaaaaaab", "bbbaabbabbbbbbaaaabbabbbbbbbaaabaababbaaaabbbaababbaaabbbbbbbbabbabababbaaabaabaaabaaaabbbbbabaabaaa", "bbaaabaaabaaabaabaaabbaabaabbabaabaabbababaaaaabaabbbbaba", "abaababaaabbabaabaabbbaaabbaabababbabaaabbbbabbbbbaaaaa", "abba", "abbbababbaaabbaaabbbabaabbababaaabbbbaaaaababbabbaabbabbbaaabaabbaaaaabaaaabbbaabbbabbbbbbbabb", "bbabbaaabaaaabbaaaabbbaaaababbbaabaaaaab", "abbaabaabbaaaaaaaabbaabbabbababaaaaaaabbabaabaabbbabbaabbaababbaabbaba", "bbbbaababbaaaaaaaaabbbabbbabaabababaababaababa", "baaabaabbbbbbaabbabbbabaaaaababaabaababbbaaaaaaaabbbbbabbabaaaaaaaabababaabaababaaabbaaaaaaaaabaa", "aababbbabbaaaaababbabaababbbbbbbbaaabbaaaaabbaabbbba", "ababababaaaaaabbbabbaaababaabb", "bababbaababaabbbabbaab", "baababababbaaaaabbbbbbbbbaabababb", "bbbbb", "aabaabbbaabababbababaaaaabbbbaababaabbabbbbbbaabbaaabbababbbabbabbbaabbbab", "bbaabbbbaabbaaaaaabbbaabababbbaabaaabbbbbabaababbbaababbbaaabaaabaaaababbbbaabbaababb", "aaababbaaaaabaabababbabaabbbbabbaba" );

        for (String value : A) {
            String newTet = value.substring(1, value.length()) + value;
            KMLPatternSearch(newTet.toCharArray(), value.toCharArray(), result);
        }
        int resultt=0;
        for (Map.Entry<String, Integer> itr : result.entrySet()) {
            if(resultt!=itr.getValue()){
                resultt=itr.getValue();
            }
        }
        System.out.println(resultt);
    }

    //ArrayList<String> A
    private static boolean KMLPatternSearch(char[] text, char[] pattern, Map<String, Integer> result) {
        int textLength = text.length;
        int patternLength = pattern.length;

        if (textLength < patternLength) {
            return false;
        }

        int lps[] = new int[patternLength];

        computeKLMArray(pattern, lps, patternLength);
        int patternPointer = 0;
        int textPointer = 0;

        while (textPointer < textLength) {
            if (text[textPointer] == pattern[patternPointer]) {
                textPointer++;
                patternPointer++;
            }
            if (patternPointer == patternLength) {
                result.put(pattern.toString(), textPointer - patternPointer);
                patternPointer = lps[patternPointer - 1];
            } else if (textPointer < textLength && pattern[patternPointer] != text[textPointer]) {
                if (patternPointer != 0) {
                    patternPointer = lps[patternPointer - 1];
                } else {
                    textPointer++;
                }
            }
        }


        return false;
    }

    private static void computeKLMArray(char[] pattern, int[] lps, int patternLength) {
        int len = 0;
        lps[0] = 0;
        int i = 1;
        while (i < patternLength) {
            if (pattern[i] == pattern[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}


