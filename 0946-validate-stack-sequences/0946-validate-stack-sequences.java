class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        int m = popped.length;

        if (n != m) return false;

        int[] stack = new int[n];
        int top = -1;
        int j = 0;

        for (int i = 0; i < n; i++) {
            stack[++top] = pushed[i];

            while (top >= 0 && stack[top] == popped[j]) {
                top--;
                j++;
            }
        }

        return top == -1;
    }
}
