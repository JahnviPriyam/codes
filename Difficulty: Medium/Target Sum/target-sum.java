// User function Template for Java

class Solution {
    static int findTargetSumWays(int N, int[] A, int target) {
        // code here
        int n= A.length;
        int sum=0;
        for(int i=0; i<n; i++)
        {
            sum+=A[i];
        }
        if(sum<Math.abs(target)||(sum+target)%2!=0)
        {
            return 0;
        }
        int m= N;
        m=(sum+target)/2;
        int[][] dp= new int[n+1][m+1];
        for(int i=0; i<=n; i++)
        {
            dp[i][0]=1;
        }
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=m; j++)
            {
                if(A[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-A[i-1]];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }
};