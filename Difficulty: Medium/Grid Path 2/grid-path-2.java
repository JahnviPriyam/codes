class Solution {
    public int totalWays(int N, int M, int grid[][]) {
        int mod = (int)1e9 + 7;
        int[][] dp = new int[N + 1][M + 1];
        dp[1][0] = 1;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (grid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                }
            }
        }
        return dp[N][M];
    }
}
