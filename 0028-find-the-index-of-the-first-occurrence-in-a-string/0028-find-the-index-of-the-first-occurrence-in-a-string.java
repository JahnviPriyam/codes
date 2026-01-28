class Solution {
    public int strStr(String haystack, String needle) {
        char[] h= haystack.toCharArray();
        char[] n= needle.toCharArray();
        int h1= h.length;
        int n1= n.length;
        for(int i=0; i<=h1-n1; i++)
        {
            int found=1;
            for(int j=0; j<n1; j++)
            {
                if(h[i+j]!=n[j])
                {
                    found=0;
                    break;
                }
            }
            if(found==1)
            {
                return i;
            }
        }
        return -1;
        
    }
}