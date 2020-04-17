package interview.Nova;

public class NumberOfIslands {
    private int h;
    private int w;

    public static void main(String[] args) {
        char[][] grid = { { '1', '1', '1' }, { '1', '0', '0' }, { '1', '0', '1' } };
        System.out.println("Number of islands is " + new NumberOfIslands().numIslands(grid));
    }

    public int numIslands(char[][] grid) {
        h = grid.length;
        if (h == 0)
            return 0;
        w = grid[0].length;
        boolean[][] visited = new boolean[h][w];
        int islandCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    markNeigbors(grid, visited, i, j);
                    ++islandCount;
                }
            }
        }
        return islandCount;
    }

    private void markNeigbors(char[][] grid, boolean[][] visited, int x, int y) {
        if (x < 0 || x >= h || y < 0 || y >= w || visited[x][y] || grid[x][y] != '1')
            return;
        visited[x][y] = true;
        markNeigbors(grid, visited, x + 1, y);
        markNeigbors(grid, visited, x - 1, y);
        markNeigbors(grid, visited, x, y + 1);
        markNeigbors(grid, visited, x, y - 1);

    }
}
