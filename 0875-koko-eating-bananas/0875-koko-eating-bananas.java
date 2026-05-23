class Solution {

    boolean isValidSpeed(int[] piles, int mid, int h) {

        int time = 0;

        for (int num : piles) {

            time += (num + mid - 1) / mid;

        }

        return time <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int n = piles.length;

        int low = 1;
        int high = piles[0];

        for (int i = 1; i < n; i++) {

            if (piles[i] > high) {
                high = piles[i];
            }
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isValidSpeed(piles, mid, h) == true) {

                high = mid;

            } else {

                low = mid + 1;
            }
        }

        return low;
    }
}