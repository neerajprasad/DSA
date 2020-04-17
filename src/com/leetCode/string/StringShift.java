package leetCode.string;

public class StringShift {
    public static String stringShift(String s, int[][] shift) {
        int finalShift = 0;

        for (int i = 0; i < shift.length; i++) {
            for (int j = 0; j < shift[i].length - 1; j++) {
                if (shift[i][j] == 1) {
                    finalShift += shift[i][j + 1];
                } else {
                    finalShift -= shift[i][j + 1];
                }
            }
        }
        if (finalShift >= 0)
            for (int i = 0; i < finalShift; i++) {
                s = shift(s);
            }
        else{
            for (int i = 0; i < Math.abs(finalShift); i++) {
                s = shiftLeft(s);
            }
        }
        return s;
    }

    private static String shiftLeft(String s) {
        return s.substring(1, s.length() ) + s.charAt(0) ;
    }


    public static String shift(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
}
