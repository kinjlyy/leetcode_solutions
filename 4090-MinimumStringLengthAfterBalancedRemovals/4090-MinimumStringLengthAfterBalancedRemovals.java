// Last updated: 7/4/2026, 7:40:44 PM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='a') a++;
            else b++;
        }
        return Math.abs(a-b);
    }}
       