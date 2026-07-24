// Last updated: 7/24/2026, 2:53:31 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int peak=peak(nums);
4        if(target<=nums[nums.length-1]) return binary(nums,peak, nums.length-1, target);
5        else return binary(nums,0,peak-1, target);
6
7    }
8    public int peak(int[] nums){
9        int lo=0;
10        int hi=nums.length-1;
11        
12       while(lo<hi){
13        int mid=lo+(hi-lo)/2;       
14        if(nums[mid]>nums[hi]) lo=mid+1;
15        else hi=mid;
16       }
17       return lo;
18    }
19    private int binary(int[] nums, int left, int right, int target) {
20        while (left <= right) {
21            int mid = left + (right - left) / 2;
22            if (nums[mid] == target) return mid;
23            else if (nums[mid] < target) left = mid + 1;
24            else right = mid - 1;
25        }
26        return -1;
27    }
28}
29