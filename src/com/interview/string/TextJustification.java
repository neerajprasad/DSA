package interview.string;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] text = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        int sLength = 16;
        System.out.println(fullJustify(text, sLength));
    }

    private static List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<String>();
        if (words == null || words.length <= 0) {
            return result;
        }
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (sb.length() < maxWidth) {
                sb.append(words[i]);

            }
        }


        return result;
    }
}
