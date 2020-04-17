package interview.Matrix;

import java.util.List;

public class PopUpTruck {

    public static int numberAmazonTreasureTrucks(int rows, int column,
                                                 List<List<Integer>> grid) {

        int[][] count = new int[rows][column];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                count[i][j] = 0;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                if (grid.get(i).get(j) == 1) {
//                    both are zero , max +1
                    if (i - 1 >= 0 && j - 1 >= 0) {
                        if (grid.get(i - 1).get(j) == 0 && grid.get(i).get(j - 1) == 0) {
                            count[i][j] = Math.max(count[i - 1][j], count[i][j - 1]) + 1;
                        } else if (grid.get(i - 1).get(j) == 1 || grid.get(i).get(j - 1) == 1) {
                            count[i][j] = Math.max(count[i - 1][j], count[i][j - 1]);
                        }
                    } else if (i - 1 < 0) {
                        if (j - 1 < 0)
                            count[i][j] = 1;
                        else {
                            count[i][j] = count[i][j - 1];
                        }
                    } else if (j - 1 < 0 ) {
                        if(grid.get(i-1).get(j)==1)
                            count[i][j] = count[i - 1][j] + 1;
                        else{
                            count[i][j] = count[i - 1][j];
                        }
                    }
                } else {
                    if (i - 1 >= 0 && j - 1 >= 0) {

                            count[i][j] = Math.max(count[i - 1][j], count[i][j - 1]);

                    } else if (i - 1 < 0) {
                        if (j - 1 < 0)
                            count[i][j] = 1;
                        else {
                            count[i][j] = count[i][j - 1];
                        }
                    } else if (j - 1 < 0) {
                        count[i][j] = count[i - 1][j];
                    }
                }
            }
        }
        return count[rows - 1][column - 1];
    }
}
