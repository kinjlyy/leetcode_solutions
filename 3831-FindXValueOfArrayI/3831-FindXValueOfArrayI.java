// Last updated: 7/4/2026, 7:41:53 PM
class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res = new long[k];
        long[] prev = new long[k];
        for (int num : nums) {
            int numm = num % k;
            long[] curr = new long[k];
            curr[numm]++;
            for (int r = 0; r < k; ++r) {
                if (prev[r] > 0) {
                    curr[(int) ((r * (long) numm) % k)] += prev[r];
                }
            }
            for (int r = 0; r < k; ++r) {
                res[r] += curr[r];
            }
            prev = curr;
        }
        return res;
    }
}