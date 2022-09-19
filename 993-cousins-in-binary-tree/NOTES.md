In DFs
TC - O(n)
SC - O(n)
​
TreeNode x_parent;
TreeNode y_parent;
int x_depth;
int y_depth;
​
​
​
if(root == null) return false;
dfs(root,x,y,0,null);
return x_depth == y_depth && x_parent != y_parent;
}
private void dfs(TreeNode root, int x, int y, int depth, TreeNode parent){
if(root == null) return;
if(root.val == x)
{
x_parent = parent;
x_depth = depth;
}
if(root.val == y){
y_parent = parent;
y_depth = depth;
}
dfs(root.left, x,y, depth + 1, root);
dfs(root.right,x,y,depth + 1, root);