class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            int[] temp = new int[n];
            int idx = 0;
            temp[idx++] = nums[i];

            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[j - 1]) {
                    continue;
                }
                if (nums[j] == nums[j - 1] + 1) {
                    temp[idx++] = nums[j];
                } else {
                    break;
                }
            }
            maxLen = Math.max(maxLen, idx);
        }
        return maxLen;
    }
}
