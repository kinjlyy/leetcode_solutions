// Last updated: 7/4/2026, 7:41:09 PM

class Solution {
    Integer[][][] dp;

    public int maxPathScore(int[][] grid, int k) {

        dp = new Integer[grid.length][grid[0].length][k + 1];

        int startCost = (grid[0][0] == 0 ? 0 : 1);

        return solve(grid,0,0,
                grid.length,
                grid[0].length,
                k - startCost);
    }

    public int solve(int[][] grid, int i, int j,
                     int m, int n, int k) {

        if(i > m-1 || j > n-1) return -1;

        if(k < 0) return -1;

        if(i == m-1 && j == n-1)
            return grid[i][j];

        if(dp[i][j][k] != null)
            return dp[i][j][k];

        int right = -1;
        int down = -1;

        if(j + 1 < n) {
            int val = solve(grid,
                    i,
                    j + 1,
                    m,
                    n,
                    k - (grid[i][j+1] == 0 ? 0 : 1));

            if(val != -1)
                right = grid[i][j] + val;
        }

        if(i + 1 < m) {
            int val = solve(grid,
                    i + 1,
                    j,
                    m,
                    n,
                    k - (grid[i+1][j] == 0 ? 0 : 1));

            if(val != -1)
                down = grid[i][j] + val;
        }

        return dp[i][j][k] = Math.max(right, down);
    }
}

