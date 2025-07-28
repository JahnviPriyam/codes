class Solution {
    public int findIntegers(int n) {
        String bin = Integer.toBinaryString(n);
        int len = bin.length();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 2;

        // Fibonacci: dp[i] = dp[i-1] + dp[i-2]
        for (int i = 2; i <= len; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int res = 0;
        for (int i = 0; i < len; i++) {
            if (bin.charAt(i) == '1') {
                res += dp[len - i - 1];
                if (i > 0 && bin.charAt(i - 1) == '1') return res;
            }
        }

        return res + 1; // +1 to include n itself if valid
    }
}
