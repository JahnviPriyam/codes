class Solution {
    public int trap(int[] height) {
        int n= height.length;
        if(n==0)
        {
            return 0;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]= height[0];
        for(int i=1; i<n; i++)
        {
            left[i]= Math.max(left[i-1], height[i]);
        }
        right[n-1]= height[n-1];
        for(int i=n-2; i>=0; i--)
        {
            right[i]= Math.max(right[i+1], height[i]);
        }
        int total_water= 0;
        for(int i=0; i<n; i++)
        {
            total_water+=Math.min(left[i], right[i])- height[i];
        }
        return total_water;
        
    }
}