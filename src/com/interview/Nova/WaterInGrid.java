package interview.Nova;

import java.util.Scanner;

public class WaterInGrid {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] inputValue = s.nextLine().split(" ");
        int row = Integer.parseInt(inputValue[0]);
        int col = Integer.parseInt(inputValue[1]);
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            String line = s.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j)=='*')
                    mat[i][j] =0;
                else
                    mat[i][j] =1;
            }
        }
        System.out.println(numIslands(mat));
    }
    public static int numIslands(int[][] grid) {
        int h;
        int w;
        h = grid.length;
        if (h == 0)
            return 0;
        w = grid[0].length;
        boolean[][] visited = new boolean[h][w];
        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    markNeigbors(grid, visited, i, j,h,w);
                    ++islandCount;
                }
            }
        }
        return islandCount;
    }

    private static void markNeigbors(int[][] grid, boolean[][] visited, int x, int y, int h, int w) {
        if (x < 0 || x >= h || y < 0 || y >= w || visited[x][y] || grid[x][y] != '1')
            return;
        visited[x][y] = true;
        markNeigbors(grid, visited, x + 1, y,h,w);
        markNeigbors(grid, visited, x - 1, y,h,w);
        markNeigbors(grid, visited, x, y + 1,h,w);
        markNeigbors(grid, visited, x, y - 1,h,w);

    }
}
