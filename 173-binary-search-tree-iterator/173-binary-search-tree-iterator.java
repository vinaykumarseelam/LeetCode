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
class BSTIterator {
ArrayList<Integer> li;
    int i;
    public BSTIterator(TreeNode root) {
        this.li = new ArrayList<>();
        inorder(root);
    }
    public void inorder(TreeNode root){
        //base 
        if(root == null) return;
        
        //logic 
        inorder(root.left);
        
        //st.pop()
        
        li.add(root.val);
        
        inorder(root.right);
        
    }
    public int next() {
        int re = li.get(i);
        i++;
        return re;
    }
    
    public boolean hasNext() {
        return i != li.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */