class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int[] values = new int[n];
        int[] freq = new int[n];
        int size = 0;

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                values[size] = nums[i - 1];
                freq[size] = count;
                size++;
                count = 1;
            }
        }

        values[size] = nums[n - 1];
        freq[size] = count;
        size++;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (freq[j] > freq[i]) {

                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = values[i];
        }

        return ans;
    }
}