class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        int n= nums.length;
        for (int i=0; i<n; i++) {
            sum += nums[i];
        }

        if (sum < Math.abs(target) || (sum + target) % 2 != 0) {
            return 0;
        }

        int m = (sum + target) / 2;

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][m];
    }
}
