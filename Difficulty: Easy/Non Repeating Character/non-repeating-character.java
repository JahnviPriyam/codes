class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int n= s.length();
        for(int i=0; i<n; i++)
        {
            int found=0;
            for(int j=0; j<n; j++)
            {
                if(i!=j && s.charAt(i)==s.charAt(j))
                {
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                return(s.charAt(i));
            }
        }
        return '$';
        
    }
}
