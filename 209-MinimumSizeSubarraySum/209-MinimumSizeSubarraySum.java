// Last updated: 7/19/2026, 11:02:03 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int i=0;
4        
5        int max=Integer.MAX_VALUE;
6        int sum=0;
7       for(int j=0;j<nums.length;j++){
8        sum+=nums[j];
9        while(sum>=target){
10             max=Math.min(max,j-i+1);
11            sum-=nums[i];
12            i++;
13
14        }
15       
16       }
17       return (max==Integer.MAX_VALUE)?0:max;
18        
19    }
20}