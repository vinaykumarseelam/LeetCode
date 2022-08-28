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
    int result;
    public int sumNumbers(TreeNode root) {
        
//         Stack<TreeNode> st = new Stack<>();
//         Stack<Integer> numSt = new Stack<>();
//         int currentval = 0;
     
//         int result = 0;
//         while(root != null || !st.isEmpty()){
//             while(root!=null){
//                 st.push(root);
//                 System.out.println("root" + root);
//                 currentval = currentval*10 + root.val;
//                 System.out.println("firstValue" + currentval);
//                 numSt.push(currentval);
//                 root = root.left;
//             }
            
//             // st.pop()
            
//             root = st.pop();
//             currentval = numSt.pop();
//             System.out.println("popValue" + currentval);
            
//             //checking leaf node
            
//             if((root.left == null) && (root.right == null)){
//                 result += currentval;
//                 System.out.println("resultvalue" + result);
//             }
//             root = root.right;
//        }
        helper(root,0);
        return result;
    }
    private void helper(TreeNode root, int currNum){
        //base
        
        if(root == null) return;
        //logic
        if(root.left == null && root.right == null){
           result += currNum*10 + root.val;
        }
        helper(root.left, currNum*10 + root.val);
        helper(root.right, currNum*10 + root.val);
    }
}