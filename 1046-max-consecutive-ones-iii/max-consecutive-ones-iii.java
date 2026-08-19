class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLength=0,l=0,r=0,zeroes=0;
        while(r<n){
            if(nums[r]==0){
                zeroes++;
            }
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            int length=r-l+1;
            maxLength=Math.max(maxLength,length);
            r++;
        }
        return maxLength;
    }
}