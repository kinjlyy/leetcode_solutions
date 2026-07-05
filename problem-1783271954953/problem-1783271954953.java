// Last updated: 7/5/2026, 10:49:14 PM
1class Solution {
2    public int totalFruit(int[] arr) {
3        int n= arr.length;
4        int i=0;
5        int j=0;
6        int max=0;
7        HashMap<Integer, Integer> map= new HashMap<>();
8        while(j<n && i<n){
9            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
10            int dist=map.size();
11            if(dist>2) {
12                if(map.get(arr[i])==1) map.remove(arr[i]);
13                else{
14                    map.put(arr[i], map.get(arr[i])-1);
15                }
16                i++;
17                }
18            max=Math.max(max,j-i+1);
19
20            j++; 
21
22        }
23        return max;
24        
25    }
26}