class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxLength = 0;
        int maxFreq = 0;
        int l = 0;
        int r = 0;
        while (r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(r) - 'A']);
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}