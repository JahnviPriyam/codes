class Solution {
    public int maxProfit(int[] prices) {
        int min= prices[0];
        int max=0;
        int n= prices.length;
        int pos=0;
        for(int i=1; i<n; i++)
        {
            if(prices[i]<min)
            {
                min=prices[i];
            }
            else
            {
                int profit= prices[i]- min;
                if(profit> max)
                max=profit;
            }
        }
        return max;
        


    }
}