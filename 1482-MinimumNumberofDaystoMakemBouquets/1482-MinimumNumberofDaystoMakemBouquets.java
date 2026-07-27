// Last updated: 7/27/2026, 9:03:49 PM
1class Solution {
2    public int minDays(int[] bloom, int m, int k) {
3        int max=0;
4        for(int i=0;i<bloom.length;i++){
5            if(bloom[i]>max) max=bloom[i];
6        }
7          int lo=0;
8          int hi=max;
9          int ans=Integer.MAX_VALUE;
10          while(lo<=hi){
11            int mid=lo+(hi-lo)/2;
12            if(check(bloom,m,k,mid)) {
13                ans=Math.min(ans,mid);
14                hi=mid-1;
15                }
16            else lo=mid+1;
17          }
18          return (ans==Integer.MAX_VALUE)?-1:ans;
19    }
20    public boolean check(int[] arr, int m, int k, int mid){
21        int con=0;
22        int ans=0;
23        for(int i=0;i<arr.length;i++){
24            if(arr[i]<=mid) con++;
25            else con=0;
26            if(con>=k) {
27                ans++;
28                con=0;}
29            if(ans==m) return true;
30        }
31        return false;
32    }
33}