class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int zeroes=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zeroes++;
                }
                if(zeroes<=k){
                    int length=j-i+1;
                    maxLength=Math.max(maxLength,length);
                }else{
                    break;
                }
            }
        }
        return maxLength;
    }
}