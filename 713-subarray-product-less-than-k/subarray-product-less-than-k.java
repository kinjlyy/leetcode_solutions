class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int i=0;
        int cnt=0;
        if (k <= 1) return 0;
        for(int j=0;j<nums.length;j++){
            pro*=nums[j];
            while(pro>=k){
                pro=pro/nums[i];
                i++;
            }
           if(pro<k) cnt+=j-i+1;
        }
        return cnt;
        
    }
}