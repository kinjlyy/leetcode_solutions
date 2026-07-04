// Last updated: 7/4/2026, 7:40:39 PM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return (nums[n-1]+nums[n-2]-nums[0]);
    }
}