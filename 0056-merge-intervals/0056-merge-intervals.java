class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n= intervals.length;

        int[][] ans = new int[n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (index == 0 || ans[index - 1][1] < intervals[i][0]) {
                ans[index][0] = intervals[i][0];
                ans[index][1] = intervals[i][1];
                index++;
            } else {
                ans[index - 1][1] = Math.max(ans[index - 1][1], intervals[i][1]);
            }
        }

        return Arrays.copyOf(ans, index);
    }
}
