// Last updated: 8/10/2026, 4:52:42 PM
1class Solution {
2    public String countAndSay(int n) {
3        return solve(n);
4        
5    }
6    public String solve(int n){
7        if(n==1) return "1";
8        String s=solve(n-1);
9        int cnt=1;
10        StringBuilder sb= new StringBuilder();
11        for(int i=1;i<s.length();i++){           
12            if(s.charAt(i-1)!=s.charAt(i)) {
13                sb.append((cnt));
14                sb.append(s.charAt(i-1));
15                cnt=1;
16        }
17            else cnt++;
18        }
19        sb.append(cnt);
20       sb.append(s.charAt(s.length() - 1));
21        return sb.toString();
22
23    }
24}