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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0) return null;
        
        int rootVal = preorder[0];
        TreeNode root = new TreeNode(rootVal);
        
        //find the root inorder array
        
        int idx = -1;
        
        for(int i = 0; i < inorder.length ; i++){
            if(inorder[i] == rootVal){
                idx = i;
                break;
            }
        }
        
        int [] inLeft = Arrays.copyOfRange(inorder, 0, idx);
        
        int [] preLeft = Arrays.copyOfRange(preorder,1, inLeft.length + 1);
        int [] preRight = Arrays.copyOfRange(preorder, inLeft.length + 1, preorder.length);
        
        int [] inRight = Arrays.copyOfRange(inorder, idx+1, inorder.length);
        
        root.left = buildTree(preLeft, inLeft);
        root.right = buildTree(preRight, inRight);
        return root;
        }
}