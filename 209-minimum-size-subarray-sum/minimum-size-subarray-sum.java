class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        
        int max=Integer.MAX_VALUE;
        int sum=0;
       for(int j=0;j<nums.length;j++){
        sum+=nums[j];
        while(sum>=target){
             max=Math.min(max,j-i+1);
            sum-=nums[i];
            i++;

        }
       
       }
       return (max==Integer.MAX_VALUE)?0:max;
        
    }
}