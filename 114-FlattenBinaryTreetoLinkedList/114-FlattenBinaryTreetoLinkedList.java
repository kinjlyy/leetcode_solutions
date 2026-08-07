// Last updated: 8/7/2026, 4:40:02 PM
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
17     TreeNode n = new TreeNode(-1);
18    TreeNode r=n;
19    public void flatten(TreeNode root) {
20        if(root==null) return;
21       
22        solve(root);
23        root.left=null;
24        root.right=n.right.right;
25        
26      
27    }
28    public void solve(TreeNode root){
29          if(root==null) return;
30          TreeNode root1= new TreeNode(root.val);
31          r.left=null;
32         r.right=root1;
33          r=r.right;
34
35        solve(root.left);  
36        solve(root.right);
37         
38          
39        
40    }
41}