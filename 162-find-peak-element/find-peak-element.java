class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // We are going uphill
                // Peak must be on the right
                low = mid + 1;
            } else {
                // We are going downhill
                // Peak can be mid or on the left
                high = mid;
            }
        }

        return low;
    }
}

  