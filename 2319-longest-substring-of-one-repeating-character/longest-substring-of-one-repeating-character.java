class Solution {
    int[] prefix;
    int[] suffix;
    int[] best;
    char[] leftChar;
    char[] rightChar;
    int[] length;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        prefix = new int[4 * n];
        suffix = new int[4 * n];
        best = new int[4 * n];
        leftChar = new char[4 * n];
        rightChar = new char[4 * n];
        length = new int[4 * n];
        build(1, 0, n - 1, s);
        int[] ans = new int[queryIndices.length];
        for (int i = 0; i < queryIndices.length; i++) {
            update(
                    1,
                    0,
                    n - 1,
                    queryIndices[i],
                    queryCharacters.charAt(i));

            ans[i] = best[1];
        }
        return ans;
    }
    void build(int node, int l, int r, String s) {
        if (l == r) {
            leftChar[node] = s.charAt(l);
            rightChar[node] = s.charAt(l);
            prefix[node] = 1;
            suffix[node] = 1;
            best[node] = 1;
            length[node] = 1;
            return;
        }
        int mid = (l + r) / 2;
        build(node * 2, l, mid, s);
        build(node * 2 + 1, mid + 1, r, s);
        merge(node);
    }
    void update(
            int node,
            int l,
            int r,
            int index,
            char ch) {
        if (l == r) {
            leftChar[node] = ch;
            rightChar[node] = ch;
            prefix[node] = 1;
            suffix[node] = 1;
            best[node] = 1;
            return;
        }
        int mid = (l + r) / 2;
        if (index <= mid) {
            update(node * 2, l, mid, index, ch);
        } else {
            update(node * 2 + 1, mid + 1, r, index, ch);
        }
        merge(node);
    }
    void merge(int node) {
        int left = node * 2;
        int right = node * 2 + 1;
        leftChar[node] = leftChar[left];
        rightChar[node] = rightChar[right];
        length[node] = length[left] + length[right];
        prefix[node] = prefix[left];
        suffix[node] = suffix[right];
        best[node] = Math.max(best[left], best[right]);
        if (rightChar[left] == leftChar[right]) {
            best[node] = Math.max(
                    best[node],
                    suffix[left] + prefix[right]);
            if (prefix[left] == length[left]) {
                prefix[node] = length[left] + prefix[right];
            }
            if (suffix[right] == length[right]) {
                suffix[node] = length[right] + suffix[left];
            }
        }
    }
}