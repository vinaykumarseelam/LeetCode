BFS(Breadth First Search)
​
List<Integer> result = new ArrayList<>();
Queue<TreeNode> q = new LinkedList<>();
if(root == null) return result;
q.add(root);
while(!q.isEmpty()){
int size = q.size();
for(int i = 0; i<size; i++){
TreeNode curr = q.poll();
if(i == size - 1){
result.add(curr.val);
}
if(curr.left != null) q.add(curr.left);
if(curr.right != null) q.add(curr.right);
}
}
return result;
//BFS
//         List<Integer> result = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         if(root == null) return result;
//         q.add(root);
//         while(!q.isEmpty()){
//             int size = q.size();
//             for(int i = 0; i< size ; i++){
//                 TreeNode curr = q.poll();
//                 if(i == size - 1){
//                     result.add(curr.val);
//                 }
//                 if(curr.left != null) q.add(curr.left);
//                 if(curr.right != null) q.add(curr.right);
//             }
//         }
//         return result;
return result;