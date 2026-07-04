// Last updated: 7/4/2026, 7:40:21 PM
class Solution {
    public String reversePrefix(String s, int k) {
        String s1=s.substring(0,k);
        String s2=s.substring(k);
        StringBuilder sb= new StringBuilder(s1);
        sb.reverse();
        return sb+s2;
        
    }
}