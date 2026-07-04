// Last updated: 7/4/2026, 7:40:24 PM
class Solution {
    public int minLength(int[] nums, int k) {
        HashMap<Integer, Integer> freq= new HashMap<>();
        int l=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            freq.put(val,freq.getOrDefault(val,0)+1);
            if(freq.get(val)==1){
                sum+=val;
            }
            while(sum>=k){
                ans=Math.min(ans,r-l+1);
                int remove=nums[l];
                freq.put(remove,freq.get(remove)-1);
                if(freq.get(remove)==0){
                    sum-=remove;
                }
                l++;
            }
        }
        return ans==Integer.MAX_VALUE ?-1:ans;
        
    }
}