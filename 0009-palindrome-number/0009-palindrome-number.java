class Solution {
    public boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        StringBuilder sb= new StringBuilder(s);
        String rev= sb.reverse().toString();
        int num= Integer.parseInt(s);
        return s.equals(rev);
    }
}