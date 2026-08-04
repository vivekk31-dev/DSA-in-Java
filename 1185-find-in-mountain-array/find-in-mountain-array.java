/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        int left = binarySearchAsc(mountainArr, 0, peak, target);
        if (left != -1)
            return left;

        return binarySearchDesc(mountainArr, peak + 1, n - 1, target);
    }

    public int findPeak(MountainArray arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) < arr.get(mid + 1))
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }

    public int binarySearchAsc(MountainArray arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target)
                return mid;

            if (arr.get(mid) < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public int binarySearchDesc(MountainArray arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == target)
                return mid;

            if (arr.get(mid) < target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}