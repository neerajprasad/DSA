package interview.Nova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfMatrix {
    public static void main(String[] args) {
        //Scanner
        Scanner s = new Scanner(System.in);
        int row = Integer.parseInt(s.nextLine());
        int col = Integer.parseInt(s.nextLine());
        int[][] mat = new int[row][col];
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        int totalSum = 0;
//        horizontal sum
        for (int i = 0; i < row; i++) {
            String[] inputValue = s.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                mat[i][j] = Integer.parseInt(inputValue[j]);
                sum += mat[i][j];
                totalSum = totalSum ^ mat[i][j];
            }

            result.add(sum);
            sum = 0;
        }
//        vertical sum
//        sum = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                sum += mat[j][i];
//            }
//            result.add(sum);
//            sum = 0;
//        }
//        Collections.sort(result);
        int querySize = Integer.parseInt(s.nextLine());
        s.nextLine();
        for (int i = 0; i < querySize; i++) {
            String[] inputValue = s.nextLine().split(" ");
            int l = Integer.parseInt(inputValue[0]);
            int r = Integer.parseInt(inputValue[1]);
            int count = 0;
            for (int ii = l; ii < r; ii++) {

                int val = totalSum ^ ii;
                if (val == 0) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}

