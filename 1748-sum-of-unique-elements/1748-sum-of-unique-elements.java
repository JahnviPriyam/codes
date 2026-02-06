class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = i + 1; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count = 1;
                    break;
                }
            }

            for (int j = 0; j < i && count == 0; j++) {
                if (nums[j] == nums[i]) {
                    count = 1;
                    break;
                }
            }

            if (count == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
