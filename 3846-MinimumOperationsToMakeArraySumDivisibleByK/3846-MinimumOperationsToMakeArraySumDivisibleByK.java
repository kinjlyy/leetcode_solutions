// Last updated: 7/4/2026, 7:41:48 PM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int num: nums){
            sum+=num;
        }
        int n= sum;
        if (sum%k==0) return 0;
        for(int i=1;i<=n;i++){
            sum--;
            if(sum%k==0) return i;
        }
        return -1;
        
    }
}