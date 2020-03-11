package interview.string.patternSearch;

public class LPSArray {
    public static void main(String[] args) {
        String str ="babb";
        StringBuilder s = new StringBuilder();
        s.append(str);
        String rev = s.reverse().toString();
        s.reverse().append("$").append(rev);

        int[] v= computeLPSArray(s.toString());

        System.out.println(str.length()-v[s.length()-1]);
        for(int i=0;i<v.length;i++)
        {
            System.out.print(v[i] + " ");
        }
    }
    public static int[] computeLPSArray(String str)
    {
        int n = str.length();
        int lps[] = new int[n];
        int i = 1, len = 0;
        lps[0] = 0; // lps[0] is always 0

        while (i < n)
        {
            if (str.charAt(i) == str.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0)
                {
                    len = lps[len - 1];

                    // Also, note that we do not increment
                    // i here
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
