class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        int low = 1, high = max, ans = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long totalhour=0;
            for(int i=0;i<piles.length;i++){
                totalhour+=piles[i]/mid;
                if(piles[i]%mid!=0){
                    totalhour+=1;
                }
            }
            if(totalhour>h){
                low=mid+1;
            }else if(totalhour<=h){
                high=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}