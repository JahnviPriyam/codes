class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = sb.indexOf(String.valueOf(ch));
            if (index != -1) {
                sb.delete(0, index + 1);
            }
            sb.append(ch);
            max = Math.max(max, sb.length());
        }

        return max;
    }
}
