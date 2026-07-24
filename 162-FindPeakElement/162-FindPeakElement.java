// Last updated: 7/24/2026, 4:43:29 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int low = 0;
4        int high = nums.length - 1;
5        while (low < high) {
6            int mid = low + (high - low) / 2;
7
8            if (nums[mid] < nums[mid + 1]) {
9                // We are going uphill
10                // Peak must be on the right
11                low = mid + 1;
12            } else {
13                // We are going downhill
14                // Peak can be mid or on the left
15                high = mid;
16            }
17        }
18
19        return low;
20    }
21}
22
23  