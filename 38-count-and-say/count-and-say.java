class Solution {
    public String countAndSay(int n) {
        return solve(n);
        
    }
    public String solve(int n){
        if(n==1) return "1";
        String s=solve(n-1);
        int cnt=1;
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<s.length();i++){           
            if(s.charAt(i-1)!=s.charAt(i)) {
                sb.append((cnt));
                sb.append(s.charAt(i-1));
                cnt=1;
        }
            else cnt++;
        }
        sb.append(cnt);
       sb.append(s.charAt(s.length() - 1));
        return sb.toString();

    }
}