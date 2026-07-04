// Last updated: 7/4/2026, 7:41:29 PM

class Solution {

    static class State {
        int i, j, timeParity;
        long cost;

        public State(int i, int j, int timeParity, long cost) {
            this.i = i;
            this.j = j;
            this.timeParity = timeParity; 
            this.cost = cost;
        }
    }

    public long minCost(int m, int n, int[][] waitCost) {
        long[][][] dist = new long[m][n][2]; // [i][j][parity]
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j][0] = Long.MAX_VALUE;
                dist[i][j][1] = Long.MAX_VALUE;
            }
        }

        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingLong(s -> s.cost));
        long startCost = 1L * (1) * (1); // cost to enter (0,0)
        dist[0][0][1] = startCost;
        pq.offer(new State(0, 0, 1, startCost));

        int[][] directions = {{1, 0}, {0, 1}}; // down, right

        while (!pq.isEmpty()) {
            State curr = pq.poll();

            if (curr.i == m - 1 && curr.j == n - 1) {
                return curr.cost;
            }

            if (dist[curr.i][curr.j][curr.timeParity] < curr.cost) continue;

            if (curr.timeParity == 1) {
                // Can move to right or down
                for (int[] dir : directions) {
                    int ni = curr.i + dir[0];
                    int nj = curr.j + dir[1];
                    if (ni < m && nj < n) {
                        long entryCost = 1L * (ni + 1) * (nj + 1);
                        long newCost = curr.cost + entryCost;
                        if (newCost < dist[ni][nj][0]) {
                            dist[ni][nj][0] = newCost;
                            pq.offer(new State(ni, nj, 0, newCost));
                        }
                    }
                }
            } else {
                // Must wait
                long wait = waitCost[curr.i][curr.j];
                long newCost = curr.cost + wait;
                if (newCost < dist[curr.i][curr.j][1]) {
                    dist[curr.i][curr.j][1] = newCost;
                    pq.offer(new State(curr.i, curr.j, 1, newCost));
                }
            }
        }

        return -1; // unreachable
    }
}
