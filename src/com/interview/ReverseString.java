package java.interview;

public class ReverseString {


    public static void main(String ares[]) {
        String s = new String("neeraj prasad");
//        s.toCharArray() {'n','e','e','r','a','j'}
        int len=0;
        for (char c : s.toCharArray()) {
            len++;
        }
        for (int i = len-1; i >=0;i--){
            System.out.print(s.charAt(i));
        }
//        System.out.println(len);
    }

}
