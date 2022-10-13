//BruteForce
//base
if(matrix == null || matrix.length == 0) return matrix;
int [][] dirs = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
int m = matrix.length;
int n = matrix[0].length;
Queue<int []> q = new LinkedList<>();
for(int i =0; i<m ;i++){
for(int j = 0; j<n ; j++){
if(matrix[i][j] == 1){
q = new LinkedList<>();
boolean [][] visited = new boolean[m][n];
q.add(new int[]{i,j});
visited[i][j] =true;
int dist = 0; boolean flag = false;
while( !q.isEmpty() && !flag){
int size = q.size();
for(int k =0 ; k<size ; k++){
int[] curr = q.poll();
for(int[] dir : dirs){
int nr = curr[0] + dir[0];
}