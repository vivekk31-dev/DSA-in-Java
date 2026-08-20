class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        int arr1[] = new int[n];
        int arr2[] = new int[n];
        int j = 0, k = 0;
        arr1[0]=nums[0];
        j++;
        arr2[0]=nums[1];
        k++;
        for (int i = 2; i < n; i++) {
            if(arr1[j-1]>arr2[k-1]){
                arr1[j]=nums[i];
                j++;
            }else{
                arr2[k]=nums[i];
                k++;
            }
        }
        int result[] = new int[n];
        int l = 0;
        for (int i = 0; i < j; i++) {
            result[l] = arr1[i];
            l++;
        }
        for (int i = 0; i < k; i++) {
            result[l] = arr2[i];
            l++;
        }
        return result;
    }
}