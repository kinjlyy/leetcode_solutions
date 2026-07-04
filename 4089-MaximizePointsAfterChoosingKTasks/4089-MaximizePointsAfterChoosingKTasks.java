// Last updated: 7/4/2026, 7:40:45 PM
class Solution {
    public long maxPoints(int[] a, int[] b, int k) {
        int n=a.length;
        long ans=0;
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            ans+=b[i];
            diff[i]=a[i]-b[i];
        }
        Arrays.sort(diff);
        for(int i=n-1;i>=n-k;i--){
            ans+=diff[i];
            
        }
        for(int i=n-k-1;i>=0&&diff[i]>0;i--){
            ans+=diff[i];
        }
        return ans;
        
    }
}