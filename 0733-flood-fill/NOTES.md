//BFS
if(image == null || image.length == 0) return image;
if(image[sr][sc] == color) return image;
int m = image.length;
int n = image[0].length;
Queue<Integer> q = new LinkedList<>();
q.add(sr);
q.add(sc);
int oldcolor = image[sr][sc];
image[sr][sc] = color;
int[][] dirs = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
while(!q.isEmpty()){
int curr1 = q.poll();
int curr2 = q.poll();
for(int[] dir : dirs)
{
int nr = curr1 + dir[0];
int nc = curr2 + dir[1];
if(nr>=0 && nc >=0 && nr < m && nc < n && image[nr][nc] == oldcolor){
q.add(nr);
q.add(nc);
image[nr][nc] = color;
}
}
}
return image;