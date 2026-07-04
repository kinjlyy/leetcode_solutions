// Last updated: 7/4/2026, 7:41:03 PM
class Solution {
    public String mergeCharacters(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(true){
            boolean m=false;
            for(int i=0;i<sb.length();i++){
                for(int j=i+1;j<sb.length() &&j-i<=k;j++){
                    if(sb.charAt(i)==sb.charAt(j)){
                        sb.deleteCharAt(j);
                        m=true;
                        break;
                    }
                }
                if(m) break;
            }
            if(!m)break;
        }
        return sb.toString();
        
        
    }
}