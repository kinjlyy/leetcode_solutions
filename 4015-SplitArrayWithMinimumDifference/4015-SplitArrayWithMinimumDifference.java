// Last updated: 7/4/2026, 7:41:02 PM
class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1L; 
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        boolean[] leftinc = new boolean[n];
        leftinc[0] = true;
        for (int i = 1; i < n; i++) {
            leftinc[i] = leftinc[i - 1] && (nums[i] > nums[i - 1]);
        }
        boolean[] rightdec= new boolean[n];
        rightdec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            rightdec[i] = rightdec[i + 1] && (nums[i] > nums[i + 1]);
        }
        int[] p= Arrays.copyOf(nums, nums.length);

        long bestdif = Long.MAX_VALUE;
        boolean found = false;
        for (int split = 1; split < n; split++) {
            if (leftinc[split - 1] && rightdec[split]) {
                long leftSum = prefixSum[split];
                long rightSum = prefixSum[n] - prefixSum[split];
                long diff = Math.abs(leftSum - rightSum);
                if (diff < bestdif) bestdif = diff;
                found = true;
            }
        }

        return found ? bestdif : -1L;
    }
}
