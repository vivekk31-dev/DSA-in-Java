class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        findPermutation(arr, new ArrayList<>(), ans);
        return ans;
    }

    void findPermutation(List<Integer> arr, List<Integer> ds, List<List<Integer>> ans) {
        if (arr.size() == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            List<Integer> newArr = new ArrayList<>(arr);
            newArr.remove(i);
            ds.add(curr);
            findPermutation(newArr, ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
}