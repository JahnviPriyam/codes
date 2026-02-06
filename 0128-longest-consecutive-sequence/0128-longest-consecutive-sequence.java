class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, false);
        }

        int longest = 0;

        for (int x : nums) {
            if (map.get(x)) continue;

            int left = x - 1;
            int right = x + 1;
            int count = 1;

            map.put(x, true);

            while (map.containsKey(left) && !map.get(left)) {
                map.put(left, true);
                count++;
                left--;
            }

            while (map.containsKey(right) && !map.get(right)) {
                map.put(right, true);
                count++;
                right++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }
}
