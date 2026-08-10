class Solution {

    public boolean isPossible(int[] position, int m, int mid) {
        int lastPosition = position[0];
        int totalBallPlaced = 1;
        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPosition >= mid) {
                lastPosition = position[i];
                totalBallPlaced++;
            }
        }
        return totalBallPlaced >= m;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int min=position[0];
        int max=position[n-1];
        int low=1;
        int high=max-min;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(position,m,mid)){
                ans=mid;
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}