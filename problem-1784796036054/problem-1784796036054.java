// Last updated: 7/23/2026, 2:10:36 PM
1class Solution {
2    public int countSubstrings(String s) {
3        int n=s.length();
4        int cnt=0;
5        for(int i=0;i<n;i++){
6            int l=i;
7            int r=i;
8            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
9                cnt++;
10                l--;
11                r++;
12            }
13            if(i<n-1){
14            l=i;
15            r=i+1;
16            while(l>=0 && r<n && s.charAt(l)==s.charAt(r)){
17                cnt++;
18                l--;
19                r++;
20            }
21        }}
22        return cnt;
23    }
24}