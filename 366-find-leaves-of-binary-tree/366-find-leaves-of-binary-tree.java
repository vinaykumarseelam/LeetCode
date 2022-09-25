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
    public List<List<Integer>> findLeaves(TreeNode root) {
        result = new ArrayList<>();
        helper(root,0);
        return result;
    }
    
    private int helper(TreeNode root, int depth){
        //logic 
        
        if(root == null) return -1;
        if(depth == result.size()){
            result.add(new ArrayList<>());
        }
        
        int left = helper(root.left, depth + 1);
        int right = helper(root.right, depth+1);
        
        int height = Math.max(left,right) + 1;
        result.get(height).add(root.val);
        return height;
    }
}