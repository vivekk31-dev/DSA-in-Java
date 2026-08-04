class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int max =nums[n-1];
        int min= nums[0];
        int j=0;
        for(int i=min;i<=max;i++){
           if(j<nums.length&&nums[j]==i){
            j++;
           }else{
            ans.add(i);
           }
        }
        return ans;
    }
}