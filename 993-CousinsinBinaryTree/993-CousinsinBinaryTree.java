// Last updated: 8/4/2026, 7:48:00 PM
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
17    class pair{
18        TreeNode root;
19        TreeNode parent;
20        pair( TreeNode root, TreeNode parent){
21            this.root=root;
22            this.parent=parent;
23
24        }
25    }
26    public boolean isCousins(TreeNode root, int x, int y) {
27         Queue<pair> q= new LinkedList<>();
28        List<Double> arr = new ArrayList<>();
29        q.add(new pair(root,root));
30        while(!q.isEmpty()){
31            int s=q.size();
32            boolean fx=false;
33            boolean fy=false;
34            TreeNode parentx=null;
35            TreeNode parenty=null;
36            for(int i=0;i<s;i++){
37                pair pk=q.poll();
38                TreeNode nn=pk.root;
39                TreeNode par=pk.parent;
40                if(nn.val==x) {
41                    fx=true;
42                    parentx=par;}
43                if(nn.val==y) {
44                    fy=true;
45                     parenty=par;
46                }
47                if(nn.left!=null) q.add(new pair(nn.left, nn));
48                if(nn.right!=null)q.add(new pair(nn.right, nn));
49            }
50           if(fx==true && fy==true && parentx!=parenty) return true;
51        }
52        return false;
53        
54    }
55}