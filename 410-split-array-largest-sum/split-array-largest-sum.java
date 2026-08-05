class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if (k > n) {
            return -1;
        }
        long low = nums[0];
        long high = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }
        long ans = high;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) ans;
    }

    public boolean isPossible(int[] nums, int k, long mid) {
        int count = 1;
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] > mid) {
                sum = nums[i];
                count++;
            } else {
                sum += nums[i];
            }
        }
        return count <= k;
    }
}