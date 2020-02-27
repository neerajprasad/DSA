package java.interview.string;

public class LongestPalindromeSubString {


    public static void main(String[] args) {
        String str = "aaaabaaa";
        System.out.println(solution(str));
    }

    private static String solution(String A) {
        int len = A.length();
        int start = 0;
        int maxLength = 1;
        int low, high;
        for (int i = 1; i < len; ++i) {


             low = i - 1;
             high = i ;
            while (low >= 0 && high < len
                    && A.charAt(low) == A.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && A.charAt(low) == A.charAt(high)) {
                if (high - low + 1 > maxLength) {
                    start = low;
                    maxLength = high - low + 1;
                }
                --low;
                ++high;
            }

        }
        return A.substring(start, maxLength + start);
    }
}
