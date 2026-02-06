class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n= nums.length;
        int[] arr = new int[k];
        arr[0] = 1;

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = sum % k;
            if (rem < 0) rem += k;

            count += arr[rem];
            arr[rem]++;
        }

        return count;
    }
}
