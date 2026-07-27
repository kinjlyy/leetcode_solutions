class Solution {
    public int minDays(int[] bloom, int m, int k) {
        int max=0;
        for(int i=0;i<bloom.length;i++){
            if(bloom[i]>max) max=bloom[i];
        }
          int lo=0;
          int hi=max;
          int ans=Integer.MAX_VALUE;
          while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(check(bloom,m,k,mid)) {
                ans=Math.min(ans,mid);
                hi=mid-1;
                }
            else lo=mid+1;
          }
          return (ans==Integer.MAX_VALUE)?-1:ans;
    }
    public boolean check(int[] arr, int m, int k, int mid){
        int con=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) con++;
            else con=0;
            if(con>=k) {
                ans++;
                con=0;}
            if(ans==m) return true;
        }
        return false;
    }
}