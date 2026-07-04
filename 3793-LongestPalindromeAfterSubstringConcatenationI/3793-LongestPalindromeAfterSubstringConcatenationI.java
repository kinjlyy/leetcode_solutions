// Last updated: 7/4/2026, 7:42:01 PM
class Solution {
    public int longestPalindrome(String s, String t) {
        int ans=0;
        int n=s.length();
        int m=t.length();
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                String subs=s.substring(i,j);
                for(int k=0;k<=m;k++){
                    for(int l=k;l<=m;l++){
                        String subt=t.substring(k,l);
                        String c=subs+subt;
                        if(is(c)){
                            ans=Math.max(ans,c.length());
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static boolean is(String s){
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}