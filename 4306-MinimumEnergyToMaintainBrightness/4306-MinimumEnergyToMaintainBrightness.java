// Last updated: 7/4/2026, 7:40:16 PM
class Solution {
    public long minEnergy(int n, int bri, int[][] in) {
        
        int[][] na=in;
        Arrays.sort(na,(a,b)-> Integer.compare(a[0],b[0]));
        int tt=0;
        long st=na[0][0];
        long en=na[0][1];
        for(int i=1;i<na.length;i++){
            if(na[i][0]<=en) en=Math.max(en,na[i][1]);
            else{
                tt+=(en-st+1);
                st=na[i][0];
                en=na[i][1];
            }
        }
        tt+=(en-st+1);
        long bulb=(bri+2L)/3L;
        return tt*bulb;
    }
}