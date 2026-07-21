// Last updated: 7/21/2026, 9:58:11 AM
1class Solution {
2    public int subarraysDivByK(int[] nums, int k) {
3        int n=nums.length;
4        HashMap<Integer,Integer> map= new HashMap<>();
5        int[] pre= new int[n];
6         int cnt=0;
7        pre[0]=nums[0];
8        int rem1=pre[0]%k;
9         if (rem1 < 0) rem1 += k;
10        map.put(rem1%k,1);
11       
12        if(rem1==0) cnt++;
13        for(int i=1;i<n;i++){
14            pre[i]=pre[i-1]+nums[i];
15            int rem=pre[i]%k;
16            if (rem < 0) rem += k;
17            if(rem==0) cnt++;
18            if(!map.isEmpty() && map.containsKey(rem)) cnt+=map.get(rem);
19            map.put(rem, map.getOrDefault(rem,0)+1);
20
21        }
22        return cnt;
23        
24    }
25}