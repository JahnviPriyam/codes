class Solution {
    public long sumAndMultiply(int n) {
        int og= n;
        int sum=0;
        int place=1;
        int res=0;
        while(n>0)
        {
            int digit= n%10;
            if(digit!=0)
            {
                res+=digit*place;
                place *=10;
            }
            n/=10;

        }
        while(og>0)
        {
            int dig= og%10;
            sum+=dig;
            og/=10;
        }
        return (long) res*sum;
        
        
    }
}