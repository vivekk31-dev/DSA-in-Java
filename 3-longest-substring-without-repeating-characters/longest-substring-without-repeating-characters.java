class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int hash[] = new int[256];
        for (int i = 0; i < hash.length; i++) {
            hash[i] = -1;
        }
        int maxLength = 0, l = 0, r = 0;
        while (r < n) {
            if (hash[s.charAt(r)] != -1) {
                if (hash[s.charAt(r)] >= l) {
                    l = hash[s.charAt(r)] + 1;
                }
            }
            int length = r - l + 1;
            maxLength = Math.max(maxLength, length);
            hash[s.charAt(r)] = r;
            r++;
        }
        return maxLength;
    }
}