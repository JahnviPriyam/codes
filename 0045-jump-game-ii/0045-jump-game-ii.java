class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int position = n - 1;
        int jumps = 0;

        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position = i;
                    jumps++;
                    break;
                } 
            }
        }
        return jumps;
    }
}
