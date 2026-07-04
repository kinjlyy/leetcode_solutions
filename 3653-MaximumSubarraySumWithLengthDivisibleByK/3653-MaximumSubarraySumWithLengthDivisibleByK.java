// Last updated: 7/4/2026, 7:42:22 PM
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) pref[i] = pref[i - 1] + nums[i - 1];

        long ans = Long.MIN_VALUE;
        long[] minPrefix = new long[k];
        for (int i = 0; i < k; i++) minPrefix[i] = Long.MAX_VALUE;

        // iterate over prefix indices t = 0..n
        for (int t = 0; t <= n; t++) {
            int group = t % k;
            long cur = pref[t];

            // if we've seen a prefix in this group before, candidate subarray sum = cur - minPrefix[group]
            if (minPrefix[group] != Long.MAX_VALUE) {
                ans = Math.max(ans, cur - minPrefix[group]);
            }

            // record the smallest prefix sum for this group (for future j > t)
            if (cur < minPrefix[group]) minPrefix[group] = cur;
        }

        return ans;
    }
}
