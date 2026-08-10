// Last updated: 8/10/2026, 2:04:56 PM
1class Solution {
2    public int[] searchRange(int[] arr, int k) {
3        int n=arr.length;
4        int lo=0;
5        int hi=n-1;
6        int ans=-1;
7        int[] an=new int[2];
8        while(lo<=hi){
9            int mid=lo+(hi-lo)/2;
10            if(arr[mid]==k) {
11               ans=mid;
12                hi=mid-1;
13                
14            }
15            else if(arr[mid]<k) lo=mid+1;
16            else hi=mid-1;
17
18        }
19       an[0]=ans;
20        int lo1=0;
21        int hi1=n-1;
22        int ans1=-1;
23        while(lo1<=hi1){
24            int mid=lo1+(hi1-lo1)/2;
25            if(arr[mid]==k) {
26               ans1=mid;
27                lo1=mid+1;
28                
29            }
30            else if(arr[mid]<k) lo1=mid+1;
31            else hi1=mid-1;
32
33        }
34        an[1]=ans1;
35        return an;
36
37        
38    }
39}