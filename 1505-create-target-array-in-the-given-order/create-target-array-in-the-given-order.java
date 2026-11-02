class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] ans = new int[n];
        int size = 0;
        for (int i = 0; i < n; i++) {
            int pos = index[i];
            for (int j = size; j > pos; j--) {
                ans[j] = ans[j - 1];
            }
            ans[pos] = nums[i];
            size++;
        }
        return ans;
    }
}