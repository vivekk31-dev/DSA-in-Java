class Solution {

    public boolean possible(int[] bloomDay, int m, int k, int days) {
        int count = 0;
        int bouquets = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }
        bouquets += count / k;
        if (bouquets >= m) {
            return true;
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if (n < m * k) {
            return -1;
        }
        int min = bloomDay[0];
        int max = bloomDay[0];

        for (int i = 0; i < n; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }

        }
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(possible(bloomDay,m,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

}