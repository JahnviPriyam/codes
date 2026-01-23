class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int[] freq= new int[n+1];
        for(int i=0; i<n; i++)
        {
            if(nums[i]>0 && nums[i]<=n){
            freq[nums[i]]++;
            }
        }
        for(int i=1; i<=n; i++)
        {
            if(freq[i]==0)
            return i;
        }
        return n+1;
        
    }
}