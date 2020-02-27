package interview.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIpAddress {
    public static boolean isValidIP(String ipAddr){

        Pattern ptn = Pattern.compile("\"^(?=.[\\.])((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.?){4}$\"");
        Matcher mtch = ptn.matcher(ipAddr);
        return mtch.find();
    }

    public static void main(String a[]){
        System.out.println("10.23.45.12 is valid? "+ValidIpAddress.isValidIP("10.23.45.259"));
//        System.out.println("10.2a.56.32 is valid? "+ValidIpAddress.isValidIP("10.2a.56.32"));
//        System.out.println("10.23.45 is valid? "+ValidIpAddress.isValidIP("10.23.45"));
    }
}
