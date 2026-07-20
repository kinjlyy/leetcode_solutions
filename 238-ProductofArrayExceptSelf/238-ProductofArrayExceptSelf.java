// Last updated: 7/20/2026, 9:26:45 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] pre= new int[n];
5        int[] suff= new int[n];
6         int[] ans= new int[n];
7        pre[0]=1;
8        pre[1]=nums[0];
9        for(int i=2;i<n;i++){
10            pre[i]=pre[i-1]*nums[i-1];
11
12        }
13        suff[n-1]=1;
14        suff[n-2]=nums[n-1];
15         for(int i=n-3;i>=0;i--){
16            suff[i]=suff[i+1]*nums[i+1];
17
18        }
19         for(int i=0;i<n;i++){
20            ans[i]=pre[i]*suff[i];
21
22        }
23
24        return ans;
25    }
26}