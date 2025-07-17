class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;
        int m= capacity;
        int[] dp = new int[m+ 1];
        
        for (int j = 0; j <= m; j++) {
            for (int i = 0; i < n; i++) {
                if (wt[i] <= j) {
                    dp[j] = Math.max(dp[j], val[i] + dp[j - wt[i]]);
                }
            }
        }
        return dp[m];
    }
}
