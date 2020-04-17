package interview;

import java.util.List;

public class PrisonBreak {
    public static long prison(int n, int m, List<Integer> h, List<Integer> v) {
        boolean[] hc = new boolean[n+1];
        boolean[] vc = new boolean[m+1];

        for (Integer ih : h) {
            hc[ih] = true;
        }

        for (Integer ih : v) {
            vc[ih] = true;
        }
        int minValue = Integer.MIN_VALUE;
        int countY = Integer.MIN_VALUE;
        for (int i = 1, j = 0; i <= n; i++) {
            if (!hc[i]) j = 0;
            else minValue = Math.max(minValue, ++j);
        }

        for (int i = 1, j = 0; i <= m; i++) {
            if (!vc[i]) j = 0;
            else countY = Math.max(countY, ++j);
        }
        return (countY+1) * (minValue+1);
    }
}
