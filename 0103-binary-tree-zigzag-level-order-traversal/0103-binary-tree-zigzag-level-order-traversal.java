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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>(); 
        boolean flag = false;
        //base
        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty()){
            
            int size = q.size();
            
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<size ; i++){
            TreeNode curr = q.poll();
                list.add(curr.val);
               if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                    
            }
            if(flag) Collections.reverse(list);
            result.add(list);
            flag = !flag;
        }
        
        return result;
    }
}