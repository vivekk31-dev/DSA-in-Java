class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            aliceTotal += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            bobTotal += bobSizes[i];
        }
        int diff = (bobTotal - aliceTotal) / 2;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < bobSizes.length; i++) {
            set.add(bobSizes[i]);
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            int x = aliceSizes[i];
            int y = x + diff;
            if (set.contains(y)) {
                return new int[] { x, y };
            }
        }
        return new int[] {};
    }
}