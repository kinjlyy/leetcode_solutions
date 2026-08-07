// Last updated: 8/7/2026, 6:26:59 PM
1class Solution {
2    int[] dp;
3    public int rob(int[] nums) {
4        dp=new int[nums.length+1];
5        Arrays.fill(dp,-1);
6       return solve(nums,0);
7        
8    }
9    int max=0;
10    public int solve(int[] nums, int i){
11        if(i>=nums.length) return 0;
12        if(dp[i]!=-1) return dp[i];
13        int take=nums[i]+solve(nums,i+2);
14        int ntake=solve(nums,i+1);
15        max=Math.max(take,ntake);
16        return dp[i]= max;
17
18    }
19}