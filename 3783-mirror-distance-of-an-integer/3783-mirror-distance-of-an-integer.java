class Solution {
    public int mirrorDistance(int n) {
        int og=n;
        String s= Integer.toString(n);
        StringBuilder sb= new StringBuilder(s);
        String ans= sb.reverse().toString();
        int m= Integer.parseInt(ans);
        int answer= Math.abs(og-m);
        return answer;
        
    }
}