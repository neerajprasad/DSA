package java.interview.string;

public class VersionCompare {
    public static void main(String[] args) {
        String A = "4444371174137455";
        String B = "5.4";
        System.out.println(compareVersionUtil(A,B));
    }

    private static int compareVersionUtil(String A, String B) {
        double v1Value =0;
        double v2Value =0;

            for(int i=0,j=0;i<A.length() || j<B.length();){

                while(i<A.length() && A.charAt(i)!='.'){
                    v1Value = v1Value*10+(A.charAt(i)-'0');
                    i++;
                }

                while(j<B.length() && B.charAt(j)!='.'){
                    v2Value = v2Value*10+(B.charAt(j)-'0');
                    j++;
                }

                if(v1Value>v2Value){
                    return 1;

                }else if(v2Value>v1Value){
                    return -1;
                }
                else {
                    v1Value=v2Value=0;
                    i++;
                    j++;
                }
            }



        return 0;
    }

    private static int getIntValue(char charAt) {
        try{
           return  Character.getNumericValue(charAt);
        }catch (NumberFormatException e){

        }

        return 0;
    }
}
