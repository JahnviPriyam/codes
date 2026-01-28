class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = a.length - 1;

        while (i <= j) {
            if (a[i] != b[i] || a[j] != b[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
