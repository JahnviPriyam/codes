class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n= arr.length;
        int sum= 0;
        for(int i=0; i<k; i++)
        {
            sum+=arr[i];
        }
        int maxSum=sum;
        int l=0;
        int r= k-1;
        while(r<n-1)
        {
            sum-=arr[l];
            l++;
            r++;
            sum+=arr[r];
            maxSum= Math.max(maxSum,sum);
        }
        return maxSum;
    }
}