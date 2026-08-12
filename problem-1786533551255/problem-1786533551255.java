// Last updated: 8/12/2026, 4:49:11 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4
5for(int x : nums) {
6    set.add(x);
7}
8
9int max = 0;
10
11for(int x : set) {
12
13    // x is the starting point
14    if(!set.contains(x - 1)) {
15
16        int curr = x;
17        int count = 1;
18
19        while(set.contains(curr + 1)) {
20            curr++;
21            count++;
22        }
23
24        max = Math.max(max, count);
25    }
26}
27
28return max;
29    }
30}