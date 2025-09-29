class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    Dfs(grid, i, j, n, m, vis);
                    count++;
                }
            }
        }
        return count;
    }
    public void Dfs(char[][] grid, int i, int j, int n, int m, boolean[][] vis){
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j] == '0' || vis[i][j]) {
            return;
        }
        vis[i][j] = true;
        int[] r = {1,0,-1,0};
        int[] c = {0,1,0,-1};
        for(int k = 0; k<4; k++){
            int nr = i+r[k];
            int nc = j+c[k];
            Dfs(grid, nr, nc, n, m, vis);
        }
    }
}