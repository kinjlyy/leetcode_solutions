// Last updated: 7/23/2026, 5:46:49 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> set=new HashSet<>();
4        if(s.length()==0) return 0;
5        int i=0;
6        int j=0;
7        int max=1;
8        while(j<s.length() && i<=j){
9            char c=s.charAt(j);
10            while(!set.isEmpty() && set.contains(c)) {
11                set.remove(s.charAt(i));
12                i++;
13                }
14            set.add(c);
15            max=Math.max(max, j-i+1);
16            j++;
17        }
18        return max;
19        
20    }
21}