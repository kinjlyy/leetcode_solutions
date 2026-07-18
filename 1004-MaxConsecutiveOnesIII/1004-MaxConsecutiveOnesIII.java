// Last updated: 7/18/2026, 7:05:03 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int max=0;
4        int g=k;
5        int i=0;
6        for (int j = 0; j < nums.length; j++) {
7
8            if (nums[j] == 0)
9                g--;
10
11            if (g < 0) {     
12
13                if (nums[i] == 0)
14                    g++;
15
16                i++;
17            }
18
19            max = Math.max(max, j - i + 1);
20        }
21
22           
23        
24        return max;
25        
26    }
27}