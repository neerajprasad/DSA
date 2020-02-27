package java.interview.string.patternSearch;

public class KNP {
    public static void main(String[] args) {
        String text = "abaa";
        String pattern = "abaa";
        String newTet = text.substring(1,text.length())+text;
        System.out.println(naivePatternSearch(newTet.toCharArray(),pattern.toCharArray()));
    }

    private static boolean naivePatternSearch(char[] text, char[] pattern) {
        int textLength = text.length;
        int patternLength = pattern.length;

        if(textLength< patternLength){
            return false;
        }
        for (int i = 0; i <textLength-1 ; i++) {
            int j=0;
            while(j<patternLength && pattern[j]==text[i+j]){
                j++;
            }
            if(j==patternLength)
            {
                System.out.println(i);
                break;

            }

        }

        return false;
    }
}
