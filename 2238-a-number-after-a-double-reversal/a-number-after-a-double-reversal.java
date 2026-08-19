class Solution {
    public boolean isSameAfterReversals(int num) {
        int original = num;
        int rev1 = 0;
        int rev2 = 0;
        while (num != 0) {
            int digit = num % 10;
            rev1 = rev1 * 10 + digit;
            num = num / 10;
        }
        while (rev1 != 0) {
            int digit = rev1 % 10;
            rev2 = rev2 * 10 + digit;
            rev1 = rev1 / 10;
        }
        if (rev2 == original) {
            return true;
        }
        return false;
    }
}