class Solution {
    public int rob(int[] arr) {
        int n= arr.length;
        if(n==0) return 0;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0], arr[1]);
        int[] dp = new int[n];
        dp[0]= arr[0];
        dp[1]= Math.max(arr[0], arr[1]);
        for(int i=2; i<n; i++)
        {
            dp[i]= Math.max(dp[i-1], arr[i]+ dp[i-2]);
        }
        int max1= dp[n-2];
        int[] dp2 = new int[n];
        dp2[0]=0;
        dp2[1]= arr[1];
        for(int i=2; i<n; i++)
        {
            dp2[i]= Math.max(dp2[i-1], arr[i]+ dp2[i-2]);
        }
        int max2= dp2[n-1];
        return Math.max(max1, max2);
        
    }
}