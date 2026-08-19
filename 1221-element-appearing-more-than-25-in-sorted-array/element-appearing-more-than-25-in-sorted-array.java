class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int length = (n / 4) + 1;
        int count = 1;
        int ans = arr[0];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count >= length) {
                return arr[i];
            }
        }
        return ans;
    }
}