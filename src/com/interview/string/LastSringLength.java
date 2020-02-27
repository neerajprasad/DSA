package interview.string;

public class LastSringLength {
    public static void main(String[] args) {
        System.out.println(val("  as"));

    }

    private static int val(String A) {
        String[] strings = A.split(" ");
        if(strings.length<1){
            return 0;
        }else{
            return strings[strings.length-1].length();
        }
    }
}
