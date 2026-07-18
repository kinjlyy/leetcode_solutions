// Last updated: 7/18/2026, 7:52:15 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        int pro=1;
4        int i=0;
5        int cnt=0;
6        if (k <= 1) return 0;
7        for(int j=0;j<nums.length;j++){
8            pro*=nums[j];
9            while(pro>=k){
10                pro=pro/nums[i];
11                i++;
12            }
13           if(pro<k) cnt+=j-i+1;
14        }
15        return cnt;
16        
17    }
18}