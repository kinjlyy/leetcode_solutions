// Last updated: 8/9/2026, 6:11:35 PM
1class Solution {
2    Boolean[][] dp;
3    public boolean canPartition(int[] nums) {
4       
5        int sum=0;
6        for(int i:nums){
7            sum+=i;
8        }
9        if(sum%2!=0) return false;
10         dp=new Boolean[sum/2][nums.length];
11         for(Boolean[] row:dp) Arrays.fill(row, null);
12        return can(nums,0,sum/2,0,nums.length);
13        
14    }
15    public boolean can(int[] nums,int sum, int hsum,int i, int n){
16        if(i>=n || sum>hsum) return false;
17        if(sum==hsum) return true;
18        if(dp[sum][i]!=null) return dp[sum][i];
19        boolean take=can(nums,sum+nums[i],hsum,i+1,n);
20        boolean nottake=can(nums,sum,hsum,i+1,n);
21        return dp[sum][i]= take || nottake;
22
23    }
24}