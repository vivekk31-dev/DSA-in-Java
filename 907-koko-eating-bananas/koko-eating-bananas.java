class Solution {

    public long CalculateTotalHour(int[] piles, int speed) {
        long totalHour = 0;
        for (int i = 0; i < piles.length; i++) {
            totalHour += (long) Math.ceil((double) piles[i] / speed);
        }
        return totalHour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int low = 1, high = max, ans = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalH = CalculateTotalHour(piles, mid);
            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}