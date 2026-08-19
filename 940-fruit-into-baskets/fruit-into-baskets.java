class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = fruits.length;
        int maxLength = 0, l = 0, r = 0;
        while (r < n) {
            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            if (map.size() > 2) {
                while (map.size() > 2) {
                    map.put(fruits[l], map.get(fruits[l]) - 1);
                    if (map.get(fruits[l]) == 0) {
                        map.remove(fruits[l]);
                    }
                    l++;
                }

            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}