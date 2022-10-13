class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        //base
        Queue<int[]> q = new LinkedList<>();
        if(matrix == null || matrix.length == 0) return matrix;
        int [][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
        int m = matrix.length;
        int n = matrix[0].length;
        
        
        //logic
        
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n ; j++){
                if(matrix[i][j] == 0)
                {
                    //q = new LinkedList<>();
                    q.add(new int[]{i,j});
                }
                else{
                    matrix[i][j] = -1;
                }
            }
        }
       
        if(q.size() == m*n || q.size() == 0) return matrix;
        int dis = 0;
        while(!q.isEmpty()){
            //int size = q.size();
            //for(int i=0; i<size ; i++){
                  int[] curr = q.poll();
            for(int [] dir : dirs){
                int nr = curr[0] + dir[0];
                int nc = dir[1] + curr[1];
                if(nr>=0 && nr<m && nc>=0 && nc<n && matrix[nr][nc] == -1){
                    q.add(new int[]{nr,nc});
                    matrix[nr][nc] = matrix[curr[0]][curr[1]] + 1;
              //  }
            }
            }
          
            dis++;
        }
        return matrix;

        
        
    }
    
}