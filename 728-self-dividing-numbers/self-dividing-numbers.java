class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean valid = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit == 0 || i % digit != 0) {
                    valid = false;
                    break;
                }
                num = num / 10;
            }
            if (valid) {
                ans.add(i);
            }
        }
        return ans;
    }
}