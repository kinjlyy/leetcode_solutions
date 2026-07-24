class Solution {
    public int search(int[] nums, int target) {
        int peak=peak(nums);
        if(target<=nums[nums.length-1]) return binary(nums,peak, nums.length-1, target);
        else return binary(nums,0,peak-1, target);

    }
    public int peak(int[] nums){
        int lo=0;
        int hi=nums.length-1;
        
       while(lo<hi){
        int mid=lo+(hi-lo)/2;       
        if(nums[mid]>nums[hi]) lo=mid+1;
        else hi=mid;
       }
       return lo;
    }
    private int binary(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
