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
    List<Integer> ll= new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return ll;
        ll.add(root.val);
        solve(root, 0);
        return ll;
        
    }
    int max=0;
    public void solve(TreeNode r, int lvl){
        if(r==null) return;
        if(max<lvl){
            ll.add(r.val);
            max=lvl;}
        solve(r.right,lvl+1);
        solve(r.left, lvl+1);

    }
}