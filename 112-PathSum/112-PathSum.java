// Last updated: 7/17/2026, 5:13:44 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18       return solve(root,targetSum);
19    }
20    public boolean solve(TreeNode root, int sum){
21        if(root==null) return false;
22        if(root.val==sum && root.right==null && root.left==null) return true;
23        return solve(root.right, sum-root.val) || solve(root.left,sum-root.val);
24        
25
26
27    }
28}