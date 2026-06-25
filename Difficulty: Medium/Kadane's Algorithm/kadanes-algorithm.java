class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n= arr.length;
        int max= arr[0];
        int curr= arr[0];
        for(int i=1; i<n; i++)
        {
            curr= Math.max(arr[i], curr+arr[i]);
            max= Math.max(max,curr);
        }
        return max;
    }
}
