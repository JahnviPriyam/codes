class Solution {

    int count = 0;

    void solve(int row, int n, int[] col, int[] diag1, int[] diag2) {
        if (row == n) {
            count++;
            return;
        }

        for (int c = 0; c < n; c++) {

            if (col[c] == 1 || diag1[row + c] == 1 || diag2[row - c + n - 1] == 1) {
                continue;
            }

            col[c] = 1;
            diag1[row + c] = 1;
            diag2[row - c + n - 1] = 1;

            solve(row + 1, n, col, diag1, diag2);

            col[c] = 0;
            diag1[row + c] = 0;
            diag2[row - c + n - 1] = 0;
        }
    }

    public int totalNQueens(int n) {

        int[] col = new int[n];
        int[] diag1 = new int[2 * n - 1];
        int[] diag2 = new int[2 * n - 1];

        solve(0, n, col, diag1, diag2);

        return count;
    }
}