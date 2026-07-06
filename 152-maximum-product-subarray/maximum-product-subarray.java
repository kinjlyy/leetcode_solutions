class Solution {
    public int maxProduct(int[] nums) {
        
        int pre=1;
        int suff=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            pre*=nums[i];
            max=Math.max(pre,max);


        }
         for(int i=nums.length-1;i>=0;i--){
            if(suff==0) suff=1;
            suff*=nums[i];
            max=Math.max(suff,max);


        }
        return max;
    }
}