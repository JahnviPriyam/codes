class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n= nums.length;
        int sum=0;
        for(int i=0; i<k; i++)
        {
            sum+=nums[i];
        }
        int maxSum= sum;
        int l=0;
        int r= k-1;
        while(r<n-1){
            sum-=nums[l];
            l++;
            r++;
            sum+=nums[r];
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;
        
    }
}