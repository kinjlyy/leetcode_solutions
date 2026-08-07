// Last updated: 8/7/2026, 2:08:04 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        return solve(root,p,q);
13        
14    }
15    public TreeNode solve(TreeNode root, TreeNode p, TreeNode q){
16        if(root==null) return null;
17        if(root==p ||root==q) return root;
18        TreeNode left=solve(root.left,p,q);             
19        TreeNode right=solve(root.right,p,q);
20        if(left!=null && right!=null) return root;
21        else if(left!=null && right==null) return left;
22         else if(left==null && right!=null) return right;
23        else return null;
24       
25        
26
27    }
28}