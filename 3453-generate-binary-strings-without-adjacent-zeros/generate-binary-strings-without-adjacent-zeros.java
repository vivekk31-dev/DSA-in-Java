class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, "", ans);
        return ans;
    }
    public void generate(int n, String s, List<String> ans) {
        if (s.length() == n) {
            ans.add(s);
            return;
        }
        generate(n, s + "1", ans);
        if (s.length() == 0 || s.charAt(s.length() - 1) != '0') {
            generate(n, s + "0", ans);
        }
    }
}