package interview.string.patternSearch;

public class KMLSearch {
    public static void main(String[] args) {
        String text = "aabcdedc";
        String pattern = "cd*d";
        System.out.println(KMLPatternSearch(text,pattern));
    }

    private static int KMLPatternSearch(String s,String x) {
        char[] text =s.toCharArray();
        char[] pattern =x.toCharArray();
        int textLength = s.length();
        int patternLength = x.length();

        if(textLength< patternLength){
            return 0;
        }

        int lps[] =  new int[patternLength];

        computeKLMArray(pattern,lps,patternLength);
        int patternPointer=0;
        int textPointer = 0;

        while(textPointer < textLength){
            if(text[textPointer]==pattern[patternPointer] || pattern[patternPointer]=='*'){
                textPointer++;
                patternPointer++;
            }
            if(patternPointer==patternLength){
                return  (textPointer - patternPointer);
            }else if(textPointer < textLength && pattern[patternPointer]!=text[textPointer] &&pattern[patternPointer]!='*'){
                if(patternPointer!=0){
                    patternPointer = lps[patternPointer - 1];
                }else {
                    textPointer++;
                }
            }
        }




        return 0;
    }

    private static void computeKLMArray(char[] pattern, int[] lps, int patternLength) {
        int len=0;
        lps[0]=0;
        int i=1;
//        "cdcd"
        while(i<patternLength){
            if(pattern[i]==pattern[len] || pattern[i]=='*'){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }

    private static boolean KMLPatternSearch(char[] text , char[] pattern) {
        int textLength = text.length;
        int patternLength = pattern.length;

        if(textLength< patternLength){
            return false;
        }

        int lps[] =  new int[patternLength];

        computeKLMArray(pattern,lps,patternLength);
        int patternPointer=0;
        int textPointer = 0;

        while(textPointer < textLength){
            if(text[textPointer]==pattern[patternPointer]){
                textPointer++;
                patternPointer++;
            }
            if(patternPointer==patternLength){
                System.out.println("Found pattern "
                        + "at index " + (textPointer - patternPointer));
                patternPointer = lps[patternPointer - 1];
            }else if(textPointer < textLength && pattern[patternPointer]!=text[textPointer]){
                if(patternPointer!=0){
                    patternPointer = lps[patternPointer - 1];
                }else {
                    textPointer++;
                }
            }
        }




        return false;
    }
}
