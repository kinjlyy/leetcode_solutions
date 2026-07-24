// Last updated: 7/24/2026, 2:59:31 PM
1class Solution {
2     public int findMin(int[] nums){
3        int lo=0;
4        int hi=nums.length-1;     
5       while(lo<hi){
6        int mid=lo+(hi-lo)/2;       
7        if(nums[mid]>nums[hi]) lo=mid+1;
8        else hi=mid;
9       }
10       return nums[lo];
11    }
12}