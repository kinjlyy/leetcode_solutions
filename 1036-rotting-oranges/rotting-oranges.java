class Solution {
    class pair{
        int i;
        int j;
         pair(int i, int j){
            this.i=i;
            this.j=j;
        }
    }
    public int orangesRotting(int[][] grid) {
         int fresh = 0;
        Queue<pair> q= new LinkedList<>();
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2){
                q.add(new pair(i,j));
            }
            else if(grid[i][j] == 1) fresh++;
        }

       }
       if(fresh==0) return 0;
       int min=0;
       while(!q.isEmpty()){
        int size = q.size();

    for(int k=0;k<size;k++){
        pair r=q.poll();
        int x =r.i;
        int y= r.j;
        if(x+1 < grid.length && grid[x+1][y]==1) {
            grid[x+1][y]=2;
            fresh--;
            q.add(new pair(x+1,y));
       }
        if(y + 1 < grid[0].length && grid[x][y+1]==1) {
            grid[x][y+1]=2;
            fresh--;
            q.add(new pair(x,y+1));
       }
        if(x - 1 >= 0 && grid[x-1][y]==1) {
            grid[x-1][y]=2;
            fresh--;
            q.add(new pair(x-1,y));
       }
        if(y - 1 >= 0 && grid[x][y-1]==1) {
            grid[x][y-1]=2;
            fresh--;
            q.add(new pair(x,y-1));
       }
       }
       min++;
       }
       return (fresh==0)?min-1:-1;
    }
}