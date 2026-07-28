// Last updated: 7/28/2026, 8:30:38 PM
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
17    List<List<Integer>> ll=new ArrayList<>();
18    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
19        List<Integer> list=new ArrayList<>();
20        solve(root, targetSum,list);
21        return ll;
22    }
23    public void solve(TreeNode root, int sum, List<Integer> list){
24        if(root==null) return;
25        if(root.left == null && root.right == null && sum == root.val){
26            list.add(root.val);
27            ll.add(new ArrayList<>(list));
28              list.remove(list.size() - 1);
29            return;
30        }
31        list.add(root.val);
32        solve(root.left,sum-root.val,list);      
33        solve(root.right,sum-root.val,list);
34         list.remove(list.size() - 1);
35
36    }
37}