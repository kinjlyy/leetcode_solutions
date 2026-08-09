class Solution {
    Boolean[][] dp;
    public boolean canPartition(int[] nums) {
       
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
         dp=new Boolean[sum/2][nums.length];
         for(Boolean[] row:dp) Arrays.fill(row, null);
        return can(nums,0,sum/2,0,nums.length);
        
    }
    public boolean can(int[] nums,int sum, int hsum,int i, int n){
        if(i>=n || sum>hsum) return false;
        if(sum==hsum) return true;
        if(dp[sum][i]!=null) return dp[sum][i];
        boolean take=can(nums,sum+nums[i],hsum,i+1,n);
        boolean nottake=can(nums,sum,hsum,i+1,n);
        return dp[sum][i]= take || nottake;

    }
}