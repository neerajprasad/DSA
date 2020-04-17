package interview.Nova;

public class LargestNumber {
    public static long Solve(long a, long b, long c){
        long result=-1;
        for (int i = (int)c; i >=0 ; i--) {
            if(b==i%a){
                return i;
            }
        }

        return result;
    }
}
