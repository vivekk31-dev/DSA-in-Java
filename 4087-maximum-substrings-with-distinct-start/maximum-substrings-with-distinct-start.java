class Solution {
    public int maxDistinct(String s) {
        boolean seen[] = new boolean[26];
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (!seen[index]) {
                seen[index] = true;
                ans++;
            }
        }
        return ans;
    }
}