package java.interview.string.patternSearch;

public class KMLSearch {
    public static void main(String[] args) {
        String text = "aabcdedc";
        String pattern = "cde";
        System.out.println(KMLPatternSearch(text.toCharArray(),pattern.toCharArray()));
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

    private static void computeKLMArray(char[] pattern, int[] lps, int patternLength) {
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<patternLength){
            if(pattern[i]==pattern[len]){
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
}
