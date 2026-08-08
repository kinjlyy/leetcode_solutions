// Last updated: 8/8/2026, 3:10:21 PM
1class Solution {
2    int[][] dp;
3    public int longestCommonSubsequence(String text1, String text2) {
4        dp=new int[text1.length()][text2.length()];
5        for(int[] rows:dp){
6            Arrays.fill(rows,-1);
7        }
8       return solve(text1,text2,text1.length()-1,text2.length()-1);
9    }
10    int max=0;
11    public int solve(String s1, String s2, int n, int m){
12        if(n<0 || m<0) return 0;
13        if(dp[n][m]!=-1) return dp[n][m];
14        if(s1.charAt(n)==s2.charAt(m)){
15            return dp[n][m]= 1+solve(s1,s2,n-1,m-1);
16            
17        }
18        
19        else{
20       max= Math.max( solve(s1,s2,n-1,m),
21        solve(s1,s2,n,m-1));
22        }
23        return dp[n][m]= max;
24    }
25}