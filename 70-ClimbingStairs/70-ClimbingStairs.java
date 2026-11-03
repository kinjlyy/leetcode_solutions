// Last updated: 11/3/2026, 6:30:16 PM
1class Solution {
2    int[] dp;
3    public int climbStairs(int n) {
4        dp=new int[n+1];
5        Arrays.fill(dp, -1);
6        return climb(n);
7        
8    }
9    public int climb(int n){
10        if(n==0) return 1;
11        if(n<0) return 0;
12        if(dp[n]!=-1) return dp[n];
13        return dp[n]=climb(n-1)+ climb(n-2);
14    }
15}