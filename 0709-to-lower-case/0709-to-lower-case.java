class Solution {
    public String toLowerCase(String s) {
        int slen= s.length();
        String r= "";
        for(int i=0; i<slen; i++)
        {
            char ch= s.charAt(i);
            if(ch>='A' && ch<='Z'){
            r+=(char)(s.charAt(i)+32);
            }
            else
            {
                r+=ch;
            }
        }
        return r;
        
    }
}