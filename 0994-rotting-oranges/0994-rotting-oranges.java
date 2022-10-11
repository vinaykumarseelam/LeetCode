class Solution {
    int[][] dirs;
    public int orangesRotting(int[][] grid) {
        
        if(grid == null || grid.length == 0) return 0;
       int m = grid.length;
       int n = grid[0].length;
        //dirs = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
         dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
       
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 2){
                    dfs(grid,i,j,2,m,n);
                }
            }
        }
        int max = 0;
        for(int i = 0; i< m ;i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1) return -1;
                if(grid[i][j] > 0){
                max = Math.max(max,grid[i][j] - 2);    
                }
            
            }
        }
        return max;
        
    }
    
    
    private void dfs(int[][] grid, int r, int c, int time, int m, int n){
        //int[][] dirs = {{-1,0},{0,-1},{1,0},{0,1}};
        //base
        if(r<0 || r == m || c<0 || c == n || grid[r][c] == 0) return;
        if(grid[r][c] != 1 && grid[r][c] < time) return;
        
        //logic
        grid[r][c] = time;
        for(int[] dir : dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            
            dfs(grid,nr,nc,time+1,m,n);
        }
        
    }
    
}