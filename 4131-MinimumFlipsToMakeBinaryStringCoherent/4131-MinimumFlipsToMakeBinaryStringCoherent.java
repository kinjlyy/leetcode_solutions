// Last updated: 7/4/2026, 7:40:32 PM
class Solution {
    public int minFlips(String s) {
        int n=s.length();
        String v=s;
        int ones=0;
        for(char c:s.toCharArray()) if(c=='1') ones++;
        int ans=Integer.MAX_VALUE;
        ans=Math.min(ans,ones);
        ans=Math.min(ans,n-ones);
        for(int i=0;i<n;i++){
            int cost=ones-(s.charAt(i)=='1'? 1:0)+(s.charAt(i)=='0'?1:0);
            ans=Math.min(ans,cost);
            
        }
        if(n>=2) {
            int cost=0;
        if(s.charAt(0)=='0') cost++;
        if(s.charAt(n-1)=='0') cost++;
        for(int i=1;i<n-1;i++) if(s.charAt(i)=='1') cost++;
        ans=Math.min(ans,cost);
        
    }
    return ans;
}}