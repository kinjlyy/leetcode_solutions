// Last updated: 8/4/2026, 1:26:19 PM
1class Solution {
2    public int maxScore(int[] card, int k) {
3        int n=(card.length);
4        int sum=0;
5        int min=Integer.MAX_VALUE;
6        int w=n-k;
7        int i=0;
8        int j=0;
9        int sum1=0;
10        for(int l:card){
11            sum1+=l;
12        }
13        while(j<n){            
14            if(j>=w){
15                min=Math.min(min,sum);
16                sum-=card[i];
17                i++;
18            }
19            sum+=card[j];
20            j++;
21
22        }
23        min = Math.min(min, sum);
24        return sum1-min;
25    }
26}