// Last updated: 7/4/2026, 7:41:23 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxWindow = 0;

        int i = 0;
        for (int j = 0; j < n; j++) {
            while (nums[j] > (long)nums[i] * k) {
                i++;
            }
            maxWindow = Math.max(maxWindow, j - i + 1);
        }

        return n - maxWindow;
    }
}