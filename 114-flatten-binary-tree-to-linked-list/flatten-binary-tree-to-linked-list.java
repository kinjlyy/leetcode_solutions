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
     TreeNode n = new TreeNode(-1);
    TreeNode r=n;
    public void flatten(TreeNode root) {
        if(root==null) return;
       
        solve(root);
        root.left=null;
        root.right=n.right.right;
        
      
    }
    public void solve(TreeNode root){
          if(root==null) return;
          TreeNode root1= new TreeNode(root.val);
          r.left=null;
         r.right=root1;
          r=r.right;

        solve(root.left);  
        solve(root.right);
         
          
        
    }
}