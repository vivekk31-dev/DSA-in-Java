class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int x=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                x++;
            }
        }
        if(nums[0]<nums[n-1]){
            x++;
        }
        if(x>1){
            return false;
        }
        return true;
    }
}