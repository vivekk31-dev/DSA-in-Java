class Solution {
    void func(int ind, int nums[], List<Integer> ds, List<List<Integer>> ans) {
        if (ind == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        func(ind + 1, nums, ds, ans);

        ds.remove(ds.size() - 1);
        func(ind + 1, nums, ds, ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        func(0, nums, ds, ans);
        return ans;
    }
}