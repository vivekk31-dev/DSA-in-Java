class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
            int num =nums[i];
            int rev=0;
            while(num!=0){
                int digit =num%10;
                rev=rev*10+digit;
                num=num/10;
            }
           ans.add(rev);
        }
        return ans.size();
    }
}