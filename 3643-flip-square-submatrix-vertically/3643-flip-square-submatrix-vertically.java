class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int r, int c, int k) {
        for (int i = 0; i < k / 2; i++) {
            for (int j = 0; j < k; j++) {
                int temp = grid[r + i][c + j];
                grid[r + i][c + j] = grid[r + k - 1 - i][c + j];
                grid[r + k - 1 - i][c + j] = temp;
            }
        }
        return grid;
    }
}