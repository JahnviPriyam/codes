class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        int k = -1;

        for (int i = 0; i < arr.length; i++) {
            if (k >= 0 && arr[k] == arr[i]) {
                k--;
            } else {
                arr[++k] = arr[i];
            }
        }
        return new String(arr, 0, k + 1);
    }
}
