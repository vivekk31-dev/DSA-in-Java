class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        int left =0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            while(map.get(nums[i])>k){
                map.put(nums[left],map.get(nums[left])-1);
                left++;
            }
            int count= i-left+1;
            maxCount=Math.max(maxCount,count);
        }
         return maxCount;
    }
}