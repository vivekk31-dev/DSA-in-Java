class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count = 0;

        for (int x = 1; x <= 100; x++) {
            boolean started = false;
            boolean ended = false;
            boolean special = true;

            for (int num : nums) {
                if (num == x) {
                    if (ended) {
                        special = false;
                        break;
                    }
                    started = true;
                } else if (started) {
                    ended = true;
                }
            }

            if (special && started) {
                count++;
            }
        }

        return count;
    }
}