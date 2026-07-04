// Last updated: 7/4/2026, 7:41:38 PM
import java.util.*;
class Solution {
    static class State {
        long cost;
        int x, y, t;
        State(long c, int i, int j, int tt) { cost = c; x = i; y = j; t = tt; }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length, N = m * n;

        int[][][] seen = new int[m][n][k + 1]; 
        int[][] cells = new int[N][3];
        int idx = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells[idx++] = new int[]{grid[i][j], i, j};
        Arrays.sort(cells, Comparator.comparingInt(a -> a[0]));

        
        long INF = Long.MAX_VALUE / 4;
        long[][][] dist = new long[m][n][k + 1];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dist[i][j], INF);

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingLong(s -> s.cost));
        dist[0][0][0] = 0;
        pq.add(new State(0, 0, 0, 0));

        
        int[] ptr = new int[Math.max(1, k)]; 
        int[][] dirs = {{1, 0}, {0, 1}};

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            long cost = cur.cost;
            int x = cur.x, y = cur.y, t = cur.t;
            if (cost != dist[x][y][t]) continue;
            if (x == m - 1 && y == n - 1) return (int) cost;

            
            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx < m && ny < n) {
                    long nc = cost + grid[nx][ny];
                    if (nc < dist[nx][ny][t]) {
                        dist[nx][ny][t] = nc;
                        pq.add(new State(nc, nx, ny, t));
                    }
                }
            }

            
            if (t < k) {
                int p = ptr[t];
                while (p < N && cells[p][0] <= grid[x][y]) {
                    int i = cells[p][1], j = cells[p][2];
                    if (cost < dist[i][j][t + 1]) {
                        dist[i][j][t + 1] = cost;
                        pq.add(new State(cost, i, j, t + 1));
                    }
                    p++;
                }
                ptr[t] = p; 
            }
        }
        return -1;
    }
}