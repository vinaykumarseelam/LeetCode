**(Normal Solution)**
​
​
class Solution {
public List<List<Integer>> levelOrder(TreeNode root) {
List<List<Integer>> result = new ArrayList<>();
Queue<TreeNode> q = new LinkedList<>();
q.add(root);
if(root == null) return result;
while(!q.isEmpty()){
int size = q.size();
List<Integer> temp = new ArrayList<>();
for(int i = 0; i< size ; i++){
TreeNode curr = q.poll();
temp.add(curr.val);
if(curr.left != null) q.add(curr.left);
if(curr.right != null) q.add(curr.right);
}
result.add(temp);
}
return result;
}
}