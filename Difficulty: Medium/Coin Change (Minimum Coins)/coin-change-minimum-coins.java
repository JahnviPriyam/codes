class Solution {

    public int minCoins(int coins[], int sum) {
        // code here
        int n= coins.length;
        int m= sum;
        int inf= (int)1e9;
        int[][] dp= new int[n+1][m+1];
        for(int i=0;i<=m;i++)
        {
            if(i==0)
            {
                dp[0][i]=0;
            }
            else
            {
                dp[0][i]=inf;
            }
        }
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                if(coins[i-1]>j)
                {
                    dp[i][j]= dp[i-1][j];
                }
                else
                {
                    dp[i][j]= Math.min(dp[i-1][j], 1+dp[i][j-coins[i-1]]);
                }
            }
        }
        if(dp[n][m]>=inf)
        {
            return -1;
        }
        return dp[n][m];
    }
}