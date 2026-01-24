class Solution {
    public int maximumCount(int[] nums) {
        int n= nums.length;
        int countneg=0;
        int countpos=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]<0)
            {
                countneg++;
            }
            else if(nums[i]>0)
            {
                countpos++;
            }
        }
        int max=Math.max(countneg,countpos);
        return max;
        
    }
}