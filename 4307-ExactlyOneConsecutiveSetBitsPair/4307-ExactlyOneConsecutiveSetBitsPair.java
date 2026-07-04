// Last updated: 7/4/2026, 7:40:14 PM
class Solution {
    public boolean consecutiveSetBits(int n) {
        int cnt=0;
        int prev=0;
        while(n>0){
            int curr=n&1;
            if(prev==1 && curr==1) cnt++;
            prev=curr;
            n=n>>1;
        }
        return cnt==1;
    }
}