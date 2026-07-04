// Last updated: 7/4/2026, 7:41:25 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int i = 0;

        while (i + 1 < n && nums[i] < nums[i+1]) {
            i++;
        }

        if (i == 0 || i == n - 1) return false;

        int p = i;
        while (i + 1 < n && nums[i] > nums[i+1]) {
            i++;
        }

        if (i == p || i == n - 1) return false;

        while (i + 1 < n && nums[i] < nums[i+1]) {
            i++;
        }

        return i == n - 1;
    }
}