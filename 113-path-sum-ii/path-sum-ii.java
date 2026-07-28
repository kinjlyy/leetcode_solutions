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
    List<List<Integer>> ll=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> list=new ArrayList<>();
        solve(root, targetSum,list);
        return ll;
    }
    public void solve(TreeNode root, int sum, List<Integer> list){
        if(root==null) return;
        if(root.left == null && root.right == null && sum == root.val){
            list.add(root.val);
            ll.add(new ArrayList<>(list));
              list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        solve(root.left,sum-root.val,list);      
        solve(root.right,sum-root.val,list);
         list.remove(list.size() - 1);

    }
}