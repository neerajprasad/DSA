package leetCode.string;

public class ZigZagConversionOfString {
    public String convert(String s, int numRows) {

        if(numRows<=1) return s;
        StringBuilder[] result = new StringBuilder[numRows];
        for (int i = 0; i < result.length; i++) result[i] = new StringBuilder();
        char[] chars = s.toCharArray();
        int idx=0;
        int direction=-1;
        for(char ch:chars){
            result[idx].append(ch);
            if(idx==0 || idx==numRows-1) direction = 0-direction;
            idx +=direction;
        }
        StringBuilder finalString = new StringBuilder();
        for(StringBuilder sb:result){
            finalString.append(sb);
        }
        return finalString.toString();
    }
}
