class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=(int)1e9;
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(func(piles, h, mid))
            {
                ans=mid;
                high= mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean func(int[] piles, int h, int k)
    {
        int time=0;
        for(int pile: piles)
        {
            time+=(pile+k-1)/k;

        }
        return time<=h;
    }

}