/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
     ///DFS
        result = new ArrayList<>();
        if(root == null) return result;
        dfs(root,0,result);
        return result;
    }
    public void dfs(TreeNode root, int depth, List<Integer> result){
    if(root == null) return;
    
    if(depth == result.size()){
        result.add(root.val);
    }
    dfs(root.right, depth+1, result);
    dfs(root.left, depth+1, result);
}
}



