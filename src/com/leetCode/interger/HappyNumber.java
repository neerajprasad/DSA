package leetCode.interger;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy_number(119));
    }

    public static boolean isHappy(int n) {
        if(n<0) return false;
        if(n==1) return true;
        int sum=0;
        int rem=0;
        while(sum!=1){
            rem = n%10;
            n=n/10;
            sum += rem*rem;
            if(rem==0 && n<1){
                n=sum;
                sum=0;
            }
        }
        return true;
    }
    public static boolean isHappy_number(int num)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return num == 1;
    }
}
