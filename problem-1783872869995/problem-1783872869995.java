// Last updated: 7/12/2026, 9:44:29 PM
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
17    List<Integer> ll= new ArrayList<>();
18    public List<Integer> rightSideView(TreeNode root) {
19        if(root==null) return ll;
20        ll.add(root.val);
21        solve(root, 0);
22        return ll;
23        
24    }
25    int max=0;
26    public void solve(TreeNode r, int lvl){
27        if(r==null) return;
28        if(max<lvl){
29            ll.add(r.val);
30            max=lvl;}
31        solve(r.right,lvl+1);
32        solve(r.left, lvl+1);
33
34    }
35}