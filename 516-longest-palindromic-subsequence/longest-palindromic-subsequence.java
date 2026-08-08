class Solution {
    int[][] dp;
    public int longestPalindromeSubseq(String text1) {
         dp=new int[text1.length()][text1.length()];
        for(int[] rows:dp){
            Arrays.fill(rows,-1);
        }
        String rev = new StringBuilder(text1).reverse().toString();

       return solve(text1,rev,text1.length()-1,text1.length()-1);
    }
    int max=0;
    public int solve(String s1, String s2, int n, int m){
        if(n<0 || m<0) return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(s1.charAt(n)==s2.charAt(m)){
            return dp[n][m]= 1+solve(s1,s2,n-1,m-1);
            
        }
        
        else{
       max= Math.max( solve(s1,s2,n-1,m),
        solve(s1,s2,n,m-1));
        }
        return dp[n][m]= max;
        
    }
}