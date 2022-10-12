class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //base
        
        if(image == null || image.length == 0) return image;
        if(image[sr][sc] == color) return image;
        int m = image.length;
        int n = image[0].length;
        int oldcolor = image[sr][sc];
        int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
        dfs(image,sr,sc,color,oldcolor,dirs); 
        return image;

             
            
        }
    
    private void dfs(int[][] image, int r, int c, int color, int oldcolor, int[][] dirs){
        
        //base
        if(r<0 || r == image.length || c<0 || c == image[0].length || image[r][c] != oldcolor) return;
        
        //code
        image[r][c] = color;
      
        
        for(int[] dir : dirs){
            int nr = r + dir[0];
            int nc = c + dir[1];
            dfs(image,nr,nc,color,oldcolor,dirs);
            
        }
    }
        
    }
