class Solution {
    void find(int ind, String digits, String[] map, StringBuilder ds,
            List<String> ans) {
        if (ind == digits.length()) {
            ans.add(ds.toString());
            return;
        }
        int num = digits.charAt(ind) - '0';
        String letters = map[num];
        for (int i = 0; i < letters.length(); i++) {
            ds.append(letters.charAt(i));
            find(ind + 1, digits, map, ds, ans);
            ds.deleteCharAt(ds.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        // if (digits.length() == 0) {
        //     return ans;
        // }
        String[] map = {
                "", "", "abc", "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        find(0, digits, map, new StringBuilder(), ans);
        return ans;
    }
}