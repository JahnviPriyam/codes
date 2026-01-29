class Solution {
    public int findComplement(int num) {
        long m = 1;
        while (m <= num) {
            m <<= 1;
        }
        return (int)((m - 1) ^ num);
    }
}
