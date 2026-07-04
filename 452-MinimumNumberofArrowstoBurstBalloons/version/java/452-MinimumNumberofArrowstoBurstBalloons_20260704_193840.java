// Last updated: 7/4/2026, 7:38:40 PM
1class Solution {
2    public int findMinArrowShots(int[][] arr) {
3        Arrays.sort(arr, (a,b)->Integer.compare(a[1],b[1]));
4        int grp=1;
5        int head=arr[0][1];
6        for(int i=1;i<arr.length;i++){
7            if(head>=arr[i][0]) continue;            
8            
9            else {
10                head=arr[i][1];
11                grp++;
12                }
13        }
14        return grp;
15        
16    }
17}