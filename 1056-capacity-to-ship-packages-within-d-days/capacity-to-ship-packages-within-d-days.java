class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > low) {
                low = weights[i];
            }
            high += weights[i];
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            int countDays = 1;
            for (int i = 0; i < weights.length; i++) {
                if (sum + weights[i] > mid) {
                    countDays++;
                    sum = weights[i];
                } else {
                    sum += weights[i];
                }
            }
            if (countDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}