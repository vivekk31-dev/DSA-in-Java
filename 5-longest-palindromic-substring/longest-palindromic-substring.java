class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1)
            return s;
        String ans = "";
        for (int i = 0; i < n; i++) {
            String str = "" + s.charAt(i);
            if (str.length() > ans.length()) {
                ans = str;
            }
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                str = s.charAt(l) + str + s.charAt(r);
                if (str.length() > ans.length()) {
                    ans = str;
                }
                l--;
                r++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                String str = "" + s.charAt(i) + s.charAt(i + 1);
                if (str.length() > ans.length()) {
                    ans = str;
                }
                int l = i - 1, r = i + 2;
                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    str = s.charAt(l) + str + s.charAt(r);
                    if (str.length() > ans.length()) {
                        ans = str;
                    }
                    l--;
                    r++;
                }
            }
        }
        return ans ;
    }
}