package interview.string;

public class MyAtoI {
    public static void main(String[] args) {
        String A = "-6435D56183011M11 648G1 903778065 762 75316456373673B5 334 19885 90668 8 98K X277 9846";
        System.out.println(MyAtoIUtil(A));

    }

    private static int MyAtoIUtil(String a) {
        int intValue = 0;
        int i = 0;
        int sign = 1;


        while (a.charAt(i) == ' ') {
            i++;
        }
        if (a.charAt(i) == '-' || a.charAt(i) == '+') {
            sign = 1 - 2 * (a.charAt(i) == '-' ? 1 : 0);
            i++;
        }

        while (i < a.length()) {
            if (Character.isDigit(a.charAt(i))) {
                if (intValue > Integer.MAX_VALUE / 10 ||
                        (intValue == Integer.MAX_VALUE / 10 &&
                                a.charAt(i) - '0' > 7)) {
                    if (sign == 1)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                }
                intValue = intValue * 10 + (a.charAt(i) - '0');
            } else if(a.charAt(i)==' ') {
                return sign * intValue;
            }else{
                return sign * intValue;
            }

            i++;
        }


        return sign * intValue;
    }
}
