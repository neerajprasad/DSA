package interview.array;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        new PascalTriangle().solve(5);
    }
    public String pascalValue(int n) {
        String result="";
        for (int row = 1; row <=n ;row++) {
            int value=1;
            for (int i = 1; i <=row ; i++) {
                result +=value+" ";
                value=value*(row-i)/i;
            }
            if(row!=n)
            result +="\n";
        }
        System.out.println(result);
        return result;
    }
    public ArrayList<ArrayList<Integer>> solve(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int row = 1; row <=n ;row++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            int value=1;
            for (int i = 1; i <=row ; i++) {
                currentRow.add(value);
                value=value*(row-i)/i;
            }
            result.add(currentRow);
        }
        System.out.println(result);
        return result;
    }
}
