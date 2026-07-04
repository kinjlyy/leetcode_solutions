// Last updated: 7/4/2026, 7:42:52 PM
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int i = 0, j = 0;
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;
        int breaks = 0;

        while (j < nums.length) {

            // add new element 
            if (j > 0 && nums[j - 1] + 1 != nums[j]) {
                breaks++;
            }

            // shrink window if size > k
            if (j - i + 1 > k) {
                if (nums[i] + 1 != nums[i + 1]) {
                    breaks--;
                }
                i++;
            }

            // window size == k
            if (j - i + 1 == k) {
                ans[idx++] = (breaks == 0) ? nums[j] : -1;
            }

            j++;
        }
        return ans;
    }
}
