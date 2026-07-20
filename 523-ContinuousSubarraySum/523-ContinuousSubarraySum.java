// Last updated: 7/20/2026, 9:54:16 AM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        int n=nums.length;
4        HashSet<Integer> set= new HashSet<>();
5        int[] pre= new int[n];
6        pre[0]=nums[0];
7        for(int i=1;i<n;i++){
8            pre[i]=pre[i-1]+nums[i];
9            if(pre[i]%k==0) return true;
10            else if(!set.isEmpty() && set.contains(pre[i]%k)) return true;
11            set.add(pre[i-1]%k);
12        }
13        return false;
14        
15    }
16}