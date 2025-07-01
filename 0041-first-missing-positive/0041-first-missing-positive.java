class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] > 0 && nums[i] <= n) {
                int correctIndex = nums[i] - 1;

                if (nums[i] != nums[correctIndex]) {
                    // Swap nums[i] with nums[correctIndex]
                    int temp = nums[i];
                    nums[i] = nums[correctIndex];
                    nums[correctIndex] = temp;
                    continue; // stay on the same i to check new value
                }
            }
            i++;
        }

        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
