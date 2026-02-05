class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        int[] st = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            while (top != -1 && temperatures[i] > temperatures[st[top]]) {
                int idx = st[top--];
                result[idx] = i - idx;
            }
            st[++top] = i;
        }
        return result;
    }
}
