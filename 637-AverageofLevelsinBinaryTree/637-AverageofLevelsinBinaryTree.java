// Last updated: 8/4/2026, 7:09:22 PM
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
17    public List<Double> averageOfLevels(TreeNode root) {
18         Queue<TreeNode> q= new LinkedList<>();
19        List<Double> arr = new ArrayList<>();
20        if(root==null) return arr;
21        q.add(root);
22        while(!q.isEmpty()){
23            int s=q.size();
24            double sum=0;
25            for(int i=0;i<s;i++){
26                TreeNode nn=q.poll();
27                sum+=nn.val;
28                if(nn.left!=null) q.add(nn.left);
29                if(nn.right!=null)q.add(nn.right);
30            }
31            arr.add(sum/s);
32        }
33        return arr;
34        
35    }
36}