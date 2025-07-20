class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        double result = Math.exp(0.5 * Math.log(x));
        int ans = (int) result;
        if ((long)(ans + 1) * (ans + 1) <= x) {
            return ans + 1;
        }
        return ans;
    }
}
