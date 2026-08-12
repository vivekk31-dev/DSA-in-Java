class Solution {
    public int mirrorDistance(int n) {
        int original = n;
        int rev=0;
        while(n!=0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        int ans = Math.abs(original-rev);
        return ans;
    }
}