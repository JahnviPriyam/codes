class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                ans[idx] = nums[i];
                idx++;
                if (idx == 2) break;
            }
        }
        return ans;
    }
}
