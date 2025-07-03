class Solution {
    public List<Integer> subsetIntegers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int total = 1 << n;

        for (int mask = 1; mask < total; mask++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((mask & (1 << j)) != 0) {
                    sb.append(nums[j]);
                }
            }
            res.add(Integer.parseInt(sb.toString()));
        }

        return res;
    }
}
