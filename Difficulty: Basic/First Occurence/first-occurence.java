class Solution {
    int firstOccurence(String txt, String pat) {
        int txtlen = txt.length();
        int patlen = pat.length();

        for (int i = 0; i <= txtlen - patlen; i++) {
            if (txt.substring(i, i + patlen).equals(pat)) {
                return i;
            }
        }
        return -1;
    }
}
