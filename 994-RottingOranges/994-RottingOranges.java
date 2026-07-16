// Last updated: 7/16/2026, 9:15:58 AM
1class Solution {
2    class pair{
3        int i;
4        int j;
5         pair(int i, int j){
6            this.i=i;
7            this.j=j;
8        }
9    }
10    public int orangesRotting(int[][] grid) {
11         int fresh = 0;
12        Queue<pair> q= new LinkedList<>();
13       for(int i=0;i<grid.length;i++){
14        for(int j=0;j<grid[0].length;j++){
15            if(grid[i][j]==2){
16                q.add(new pair(i,j));
17            }
18            else if(grid[i][j] == 1) fresh++;
19        }
20
21       }
22       if(fresh==0) return 0;
23       int min=0;
24       while(!q.isEmpty()){
25        int size = q.size();
26
27    for(int k=0;k<size;k++){
28        pair r=q.poll();
29        int x =r.i;
30        int y= r.j;
31        if(x+1 < grid.length && grid[x+1][y]==1) {
32            grid[x+1][y]=2;
33            fresh--;
34            q.add(new pair(x+1,y));
35       }
36        if(y + 1 < grid[0].length && grid[x][y+1]==1) {
37            grid[x][y+1]=2;
38            fresh--;
39            q.add(new pair(x,y+1));
40       }
41        if(x - 1 >= 0 && grid[x-1][y]==1) {
42            grid[x-1][y]=2;
43            fresh--;
44            q.add(new pair(x-1,y));
45       }
46        if(y - 1 >= 0 && grid[x][y-1]==1) {
47            grid[x][y-1]=2;
48            fresh--;
49            q.add(new pair(x,y-1));
50       }
51       }
52       min++;
53       }
54       return (fresh==0)?min-1:-1;
55    }
56}