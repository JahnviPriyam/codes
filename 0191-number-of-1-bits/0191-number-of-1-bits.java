class Solution {
    public int hammingWeight(int n) {
        if(n==0)
        {
            return 0;
        }
        int count=0;
        String bin="";
        while(n>0)
        {
            bin= (n%2)+bin;
            n=n/2;
        }
        for(int i=0; i<bin.length(); i++)
        {
            if(bin.charAt(i)=='1')
            {
                count++;
            }
        }
        return count;
        
    }
}