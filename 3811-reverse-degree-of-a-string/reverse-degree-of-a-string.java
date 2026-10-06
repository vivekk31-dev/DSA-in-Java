class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int position=i+1;
            int value=26-(s.charAt(i)-'a');
            ans+=position*value;
        }
        return ans;
    }
}