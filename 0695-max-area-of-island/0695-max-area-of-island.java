class Solution {
    int temp = 0;

    public void dfs(int[][] grid, int i, int j, int r, int c) {
        if (i < 0 || j < 0 || i == r || j == c || grid[i][j] == 0) {
            return;
        }
        temp++;
        grid[i][j] = 0;

        dfs(grid, i, j + 1, r, c);
        dfs(grid, i - 1, j, r, c);
        dfs(grid, i, j - 1, r, c);
        dfs(grid, i + 1, j, r, c);
    }

    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    temp = 0;
                    dfs(grid, i, j, r, c);
                    ans = Math.max(ans, temp);
                }
            }
        }
        return ans;
    }
}
