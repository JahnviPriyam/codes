class Solution {
    public boolean checkDivisibility(int n) {
        int og = n;
        int m = n;
        int sum = 0;
        int prod = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        while (og > 0) {
            int digi = og % 10;
            prod *= digi;
            og /= 10;
        }

        int total = sum + prod;
        return m % total == 0;
    }
}
