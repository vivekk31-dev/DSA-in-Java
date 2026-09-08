class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int pSum = 0;
        int count = 0;
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            pSum += nums[i];
            int remove = pSum - k;
            if (map.containsKey(remove)) {
                count += map.get(remove);
            }
            map.put(pSum, map.getOrDefault(pSum, 0) + 1);
        }
        return count;
    }
}