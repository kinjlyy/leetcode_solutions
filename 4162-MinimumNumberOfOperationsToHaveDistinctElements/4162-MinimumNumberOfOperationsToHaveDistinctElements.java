// Last updated: 7/4/2026, 7:40:23 PM
class Solution {
    public int minOperations(int[] nums) {
        int[] freq= new int[1000001];
        int dp=0;
        for(int x:nums){
            freq[x]++;
            if(freq[x]==2) dp++;
        }
        int op=0;
        int b=0;
        while(b<nums.length){
            if(dp==0) return op;
            for(int k=0;k<3 && b<nums.length;k++){
                int val=nums[b];
                if(freq[val]==2) dp--;
                freq[val]--;
                b++;
            }
            op++;
        }
        return op;
        
    }
    
}