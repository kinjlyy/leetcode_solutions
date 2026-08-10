class Solution {
    public String countAndSay(int n) {
        //iterative solution
        if(n==1) return "1";
        String s="1";
        for(int j=2;j<=n;j++){
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
       s=sb.toString();
       }

        return s;

    }
}