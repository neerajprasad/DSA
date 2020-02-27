package java.interview.string;

public class LookAndSay {
    public static void main(String[] args) {
        for(int i=1;i<7;i++) {
            System.out.println(countAndSay(i));
        }
    }

    private static String countAndSay(int A) {
        if(A==1) return "1";
        if(A==2) return "11";
        String result="";
        String countValue="11";

        for(int ii=3;ii<=A;ii++){
            String tmp = "";
            countValue +='$';
            int valueLength=countValue.length();
            char[] charValue = countValue.toCharArray();
            int count=1;


            for(int i=1;i<valueLength;i++){
                if(charValue[i]!=charValue[i-1]){
                    tmp += count+0;
                    tmp +=charValue[i-1];
                    count=1;
                }
                else count++;
            }
            countValue=tmp;
        }



        return countValue;
    }
}
