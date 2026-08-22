// Last updated: 8/22/2026, 4:51:50 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int m=n;
4        int sum=0;
5        int pro=1;
6        while(m>0){
7            int d=m%10;
8            sum+=d;
9            pro*=d;
10            m=m/10;
11
12        }
13        return (n%(sum+pro)==0);
14
15    }
16}