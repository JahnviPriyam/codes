// User function Template for Java

class Solution {
    // Function to find total number of unique paths.
    public static int NumberOfPath(int a, int b) {
        int[][] dp = new int[a][b];
        dp[0][0]=1;
        for(int i=1; i<a; i++)
        {
            dp[i][0]=1;
        }
        for(int j=1; j<b; j++)
        {
            dp[0][j]= 1;
        }
        for(int i=1; i<a; i++)
        {
            for(int j=1; j<b; j++)
            {
                dp[i][j]= dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[a-1][b-1];
        
    }
}