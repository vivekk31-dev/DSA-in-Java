class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m =mat[0].length;
        int maxRow=0;
        int maxCol=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]>mat[maxRow][maxCol]){
                    maxRow=i;
                    maxCol=j;
                    
                }
            }

        }
        return new int[]{maxRow,maxCol};
    }
}