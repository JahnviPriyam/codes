class Solution {
    public boolean isPalindrome(int x) {
       
       String s= String.valueOf(x);
       StringBuilder sb= new StringBuilder(s);
       String rev= sb.reverse().toString();
       if(s.equals(rev))
       {
        return true;
       }
       else
       {
        return false;
       }
        
    }
}