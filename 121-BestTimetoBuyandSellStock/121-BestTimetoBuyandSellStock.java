// Last updated: 8/9/2026, 7:34:46 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        int min=prices[0];
5        for(int i=1;i<prices.length;i++){
6            max=Math.max(max,prices[i]-min);
7            if(prices[i]<min) min=prices[i];
8        }
9        return max;
10    }
11}