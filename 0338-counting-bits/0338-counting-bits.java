class Solution {
    public int[] countBits(int n) {
        int[] ans= new int[n+1];
        for(int i=0; i<=n; i++)
        {
            int x=i;
            int count=0;
            while(x>0)
            {
                count+= x%2;
                x=x/2;
            }
            ans[i]=count;
        }
        return ans;
        
    }
}