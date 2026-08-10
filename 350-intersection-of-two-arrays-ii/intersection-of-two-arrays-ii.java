class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        boolean used[]=new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]&&!used[j]) {
                    ans.add(nums1[i]);
                    used[j] = true;
                    break;
                }
            }
        }
        int temp[] = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            temp[i] = ans.get(i);
        }
        return temp;
    }
}