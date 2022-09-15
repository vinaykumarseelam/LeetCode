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
     List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {
      result = new ArrayList<>();
        if(result == null) return result;
        dfs(root,0);
        return result;
        }
    public void dfs(TreeNode root, int depth){
        if(root == null) return;
        
        if(depth == result.size()){
            result.add(new ArrayList<>());
        }
        result.get(depth).add(root.val);
        
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
    }
