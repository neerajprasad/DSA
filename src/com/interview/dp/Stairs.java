package interview.dp;

public class Stairs {
    public static int climbStairs(int n) {
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1*/

        f[0] = 0;
        f[1] = 1;
        if(n==0) return 0;
        if(n==1) return 1;
        for (i = 2; i <= n+1; i++)
        {
            f[i] = f[i-1] + f[i-2];
        }

        return f[n+1];
    }

}
