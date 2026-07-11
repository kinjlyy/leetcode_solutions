// Last updated: 7/11/2026, 9:44:09 PM
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
17    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
18        List<List<Integer>> ll= new ArrayList<>();
19        int t=1;
20        Queue<TreeNode> q= new LinkedList<>();
21        if(root== null) return ll;
22        q.add(root);
23        while(!q.isEmpty()){
24            int size=q.size();
25            List<Integer> list= new ArrayList<>();
26            for(int i=0;i<size;i++){
27                TreeNode r=q.poll();
28                list.add(r.val);
29                if(r.left!=null) q.add(r.left);
30                if(r.right!=null) q.add(r.right);
31
32            }
33            if(t%2==0) Collections.reverse(list);
34            ll.add(list);
35            t++;
36        }
37        return ll;
38        
39    }
40}