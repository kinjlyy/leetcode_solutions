// Last updated: 8/5/2026, 3:31:58 PM
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
18        int id;
19        TreeNode root;
20        pair(int id, TreeNode root){
21            this.id=id;
22            this.root=root;
23        }
24    }
25    public int widthOfBinaryTree(TreeNode root) {
26        if(root==null) return 0;
27        Queue<pair> q = new LinkedList<>();
28        q.add(new pair(0,root));
29        int max=1;
30        while(!q.isEmpty()){
31            int s=q.size(); 
32            int fi=-1;
33            int si=-1;          
34            for(int i=0;i<s;i++){                              
35                pair r1=q.poll();
36                int idd=r1.id;
37                TreeNode r=r1.root; 
38                if(i==0) fi=idd;
39                if(i==s-1) si=idd;             
40              if(r.left!=null) q.add(new pair(2*idd+1, r.left));           
41              if(r.right!=null)  q.add(new pair(2*idd+2, r.right));
42            }
43            max=Math.max(si-fi+1,max);
44        }
45        return max;
46        
47    }
48    
49}