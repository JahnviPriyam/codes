class Solution {
    public int dominantIndex(int[] nums) {
        int n= nums.length;
        int max= Integer.MIN_VALUE;
        int secmax= Integer.MIN_VALUE;
        int index=-1;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>max){
                secmax= max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]> secmax)
            {
                secmax= nums[i];
            }
        }
        if(max>=2*secmax)
        {
            return index;
        }
        else{
            return -1;
        }
        
    }
}