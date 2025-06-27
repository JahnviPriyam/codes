class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int found=0;
        for(int i=0; i<n; i++)
        {
            if(nums[i]>=target)
            {
                found+=i;
                return found;
            }
        }
        return n;
    }
}