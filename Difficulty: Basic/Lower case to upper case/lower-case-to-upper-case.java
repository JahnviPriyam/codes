// User function Template for Java
class Solution {
    String to_upper(String str) {
        // code here
        int slen= str.length();
        String s="";
        for(int i=0; i<slen; i++)
        {
            s+=(char)(str.charAt(i)-32);
        }
        return s;
    }
}