class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashSet<Integer> set= new HashSet<>();
        int[] pre= new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
            if(pre[i]%k==0) return true;
            else if(!set.isEmpty() && set.contains(pre[i]%k)) return true;
            set.add(pre[i-1]%k);
        }
        return false;
        
    }
}