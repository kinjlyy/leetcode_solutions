// Last updated: 7/4/2026, 7:41:04 PM
class Solution {
    public int longestSubarray(int[] nums) {
        if (nums == null) return 0;
        int n = nums.length;
        if (n < 3) return n;
        int[] valtoremin = nums;
        int best = 2;
        int cur = 2;
        for (int i = 2; i < n; i++) {
            if (valtoremin[i] == valtoremin[i - 1] + valtoremin[i - 2]) {
                cur++;
            } else {
                cur = 2;
            }
            if (cur > best) best = cur;
        }
        return best;
        
    }
}