// Last updated: 7/23/2026, 6:18:48 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int low=0;
4        int hi=nums.length-1;
5        while(low<=hi){
6            int mid=low+(hi-low)/2;
7            if(nums[mid]==target) return mid;
8            if(nums[mid]>target)hi=mid-1;
9            else low=mid+1;
10           
11
12        }
13        return low;
14        
15    }
16}