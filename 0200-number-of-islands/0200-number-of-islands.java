class Solution {
    public int numIslands(char[][] grid) {
        //base 
       
     if(grid == null || grid.length == 0) return 0;
      int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
      int m = grid.length;
      int n = grid[0].length;
        int count = 0;
        
      //code
        for(int i = 0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == '1'){
                    count++;
                     Queue <int[]> q = new LinkedList<>();
                    q.add(new int[] {i,j});
                    grid[i][j] = '0';

                    
                    while(!q.isEmpty()){
                         int[] curr = q.poll();
                             for(int[] dir : dirs){
                                 int r = curr[0] + dir[0];
                                 int c = curr[1] + dir[1];
                                 if(r>=0 && r<m && c>=0 && c<n && grid[r][c] == '1'){
                                     q.add(new int[]{r,c});
                                     grid[r][c] = '0';
                                
                        }
                    }
                    
                }
            }
        }
        
    }
   return count;
}
}