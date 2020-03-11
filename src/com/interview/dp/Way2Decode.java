package interview.dp;

public class Way2Decode {
    public static void main(String[] args) {
        String value = "875361268549483279131";
        System.out.println(numDecodings(value));
    }

    public static int numDecodings(String A) {
        int[] count = new int[A.length() + 1];
        count[0] = 1;
        count[1] = 1;
        if (A.charAt(0) == '0') {
            return 0;
        }
        for (int i = 2; i < A.length() + 1; i++) {
            if (A.charAt(i - 1) > '0') {
                count[i] = count[i - 1];
            }

            if (A.charAt(i - 2) == '1' || (A.charAt(i - 2) == '2' && A.charAt(i - 1) < '7')) {
                count[i] += count[i - 2];
            }
        }
        return count[A.length()];
    }

    private static int getIntegerValue(char charAt) {
        return Character.getNumericValue(charAt);
    }
}
