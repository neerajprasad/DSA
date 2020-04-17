package leetCode.string;

public class BackspaceStringCompare {

    public static void main(String[] args) {
        System.out.println(removeBackspace("ab##"));
    }

    public static String removeBackspace(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i <stringBuilder.length() ; i++) {
            if(stringBuilder.charAt(i)=='#'){
                stringBuilder.deleteCharAt(i);
                if(i-1>=0) {
                    stringBuilder.deleteCharAt(i - 1);
                    i--;
                }
                i--;

            }
        }
        return stringBuilder.toString();
    }
}
