// Last updated: 7/24/2026, 2:52:34 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        if (nums == null || nums.length == 0) return -1;
4        int n = nums.length;
5        int pivot = findPivot(nums);
6        int res = binarySearch(nums, 0, pivot - 1, target);
7        if (res != -1) return res;
8        return binarySearch(nums, pivot, n - 1, target);
9    }
10
11    private int findPivot(int[] nums) {
12        int l = 0, r = nums.length - 1;
13        while (l < r) {
14            int mid = l + (r - l) / 2;
15            if (nums[mid] > nums[r]) {
16                l = mid + 1;
17            } else {
18                r = mid;
19            }
20        }
21        return l;
22    }
23
24    private int binarySearch(int[] nums, int left, int right, int target) {
25        while (left <= right) {
26            int mid = left + (right - left) / 2;
27            if (nums[mid] == target) return mid;
28            else if (nums[mid] < target) left = mid + 1;
29            else right = mid - 1;
30        }
31        return -1;
32    }
33}
34