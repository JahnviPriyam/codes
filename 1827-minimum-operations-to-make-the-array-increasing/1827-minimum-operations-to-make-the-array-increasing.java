class Solution {
    public int minOperations(int[] nums) {
        int moves=0;
        int n= nums.length;
        for(int i=1; i<n; i++)
        {
            if(nums[i]<=nums[i-1])
            {
                moves+= (nums[i-1]+1-nums[i]);
                nums[i]=nums[i-1]+1;
            }
        }
        return moves;
        
    }
}