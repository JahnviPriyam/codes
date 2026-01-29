class Solution {
    public int findComplement(int num) {

        String bin = "";
        int temp = num;

        while (temp > 0) {
            bin = (temp % 2) + bin;
            temp = temp / 2;
        }

        String flipped = "";
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0') {
                flipped = flipped + '1';
            } else {
                flipped = flipped + '0';
            }
        }

        int ans = 0;
        for (int i = 0; i < flipped.length(); i++) {
            ans = ans * 2 + (flipped.charAt(i) - '0');
        }

        return ans;
    }
}
