// Last updated: 8/8/2026, 5:15:37 PM
1class Solution {
2    int[][] dp;
3    public int minDistance(String text1, String text2) {
4         dp=new int[text1.length()][text2.length()];
5        for(int[] rows:dp){
6            Arrays.fill(rows,-1);
7        }
8        
9       int co=solve(text1,text2,text1.length()-1,text2.length()-1);
10       return text1.length()-co+text2.length()-co;
11    }
12    int max=0;
13    public int solve(String s1, String s2, int n, int m){
14        if(n<0 || m<0) return 0;
15        if(dp[n][m]!=-1) return dp[n][m];
16        if(s1.charAt(n)==s2.charAt(m)){
17            return dp[n][m]= 1+solve(s1,s2,n-1,m-1);
18            
19        }
20        
21        else{
22       max= Math.max( solve(s1,s2,n-1,m),
23        solve(s1,s2,n,m-1));
24        }
25        return dp[n][m]= max;
26        
27    }
28}