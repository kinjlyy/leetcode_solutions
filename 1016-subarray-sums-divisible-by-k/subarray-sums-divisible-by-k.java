class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map= new HashMap<>();
        int[] pre= new int[n];
         int cnt=0;
        pre[0]=nums[0];
        int rem1=pre[0]%k;
         if (rem1 < 0) rem1 += k;
        map.put(rem1%k,1);
       
        if(rem1==0) cnt++;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
            int rem=pre[i]%k;
            if (rem < 0) rem += k;
            if(rem==0) cnt++;
            if(!map.isEmpty() && map.containsKey(rem)) cnt+=map.get(rem);
            map.put(rem, map.getOrDefault(rem,0)+1);

        }
        return cnt;
        
    }
}