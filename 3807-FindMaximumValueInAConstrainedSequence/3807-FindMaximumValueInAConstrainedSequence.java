// Last updated: 7/4/2026, 7:41:56 PM
class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
        long[] ans= new long[n];
        Arrays.fill(ans,Long.MAX_VALUE);
        ans[0]=0;
        for(int[] r:restrictions){
            int idx=r[0];
            int max=r[1];
            ans[idx]=Math.min(ans[idx],max);
        }
        for(int i=0;i<n-1;i++){
            ans[i+1]=Math.min(ans[i+1], ans[i]+diff[i]);
            
        }
         for(int i=n-2;i>=0;i--){
            ans[i]=Math.min(ans[i], ans[i+1]+diff[i]);
            
        }
        long out=0;
        for(long v:ans){
            out=Math.max(out,v);
        }
        return (int)out;
        
    }
}