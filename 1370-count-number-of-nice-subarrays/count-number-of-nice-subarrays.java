class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int l = 0, count = 0;
        int oddCount = 0;
        for (int r = 0; r < nums.length; r++) {
            oddCount += nums[r] % 2;
            while (oddCount > k) {
                oddCount -= nums[l] % 2;
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}