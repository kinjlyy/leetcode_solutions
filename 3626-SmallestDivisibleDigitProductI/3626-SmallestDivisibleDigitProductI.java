// Last updated: 7/4/2026, 7:42:27 PM
class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100;i++){
            int pro=1;
            int a=i;
            while(a>0){
                pro*=a%10;
                a=a/10;

        }
            if(pro%t==0){
                return i;
            }
        }
        return -1;
        
    }

}