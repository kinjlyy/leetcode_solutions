// Last updated: 7/6/2026, 3:40:13 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        int pre=1;
5        int suff=1;
6        int max=Integer.MIN_VALUE;
7        for(int i=0;i<nums.length;i++){
8            if(pre==0) pre=1;
9            pre*=nums[i];
10            max=Math.max(pre,max);
11
12
13        }
14         for(int i=nums.length-1;i>=0;i--){
15            if(suff==0) suff=1;
16            suff*=nums[i];
17            max=Math.max(suff,max);
18
19
20        }
21        return max;
22    }
23}