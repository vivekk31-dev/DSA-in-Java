class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) {
                ans.add(nums[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] == pivot) {
                ans.add(nums[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] > pivot) {
                ans.add(nums[i]);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            nums[i] = ans.get(i);
        }
        return nums;
    }
}