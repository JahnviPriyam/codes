class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, res, new ArrayList<>(), 0);
        return res;
    }

    void backtrack(int[] nums, List<List<Integer>> res, List<Integer> temp, int start) {
        res.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, res, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
