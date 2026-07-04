// Last updated: 7/4/2026, 7:41:20 PM
import java.util.*;

class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = Math.abs((long) nums[i]);
        Arrays.sort(a);

        long ans = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (j < i + 1) j = i + 1;
            while (j < n && a[j] <= 2L * a[i]) j++;
            ans += j - i - 1;
        }
        return ans;
    }
}