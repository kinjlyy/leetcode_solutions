// Last updated: 8/10/2026, 4:57:50 PM
1class Solution {
2    public String countAndSay(int n) {
3        //iterative solution
4        if(n==1) return "1";
5        String s="1";
6        for(int j=2;j<=n;j++){
7        int cnt=1;
8        StringBuilder sb= new StringBuilder();
9        for(int i=1;i<s.length();i++){           
10            if(s.charAt(i-1)!=s.charAt(i)) {
11                sb.append((cnt));
12                sb.append(s.charAt(i-1));
13                cnt=1;
14        }
15            else cnt++;
16        }
17        sb.append(cnt);
18       sb.append(s.charAt(s.length() - 1));
19       s=sb.toString();
20       }
21
22        return s;
23
24    }
25}