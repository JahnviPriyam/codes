class Solution {
    public boolean canJump(int[] nums) {
        int n= nums.length;
        int found= n-1;
        for(int i=n-2; i>=0; i--)
        {
            if(nums[i]+i >= found)
            found= i;
            else
            {
                
            }
        }
        if(found==0)
        {
            return true;
        }
        return false;
        
    }
}