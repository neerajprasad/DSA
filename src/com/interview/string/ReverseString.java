package interview.string;

public class ReverseString {
    public static  String solve(String A) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] splitString = A.trim().split(" ");
        for (int i = splitString.length-1; i >=0 ; i--) {
            if(!"".equals(splitString[i])) {
                stringBuilder.append(splitString[i]);
                stringBuilder.append(" ");
            }else {
                i--;
            }
        }
        return stringBuilder.toString().trim();
    }

}
