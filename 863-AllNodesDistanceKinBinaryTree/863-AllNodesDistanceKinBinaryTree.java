// Last updated: 7/30/2026, 11:44:12 PM
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
11    Map<TreeNode, List<TreeNode>> map= new HashMap<>();
12    List<Integer> ll= new  ArrayList<>();
13    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
14    map.put(root, new ArrayList<>());
15    put(root);
16    find(root, target,k);
17        return ll;
18    }
19    public void put(TreeNode root){
20    if(root==null) return;
21    if(root.left!=null){
22    map.put(root.left,new ArrayList<>());
23    map.get(root.left).add(root);
24     map.get(root).add(root.left);}
25    if(root.right!=null){
26    map.put(root.right,new ArrayList<>());
27    map.get(root.right).add(root);
28    map.get(root).add(root.right);}
29    put(root.left);
30    put(root.right);
31    }
32
33    public void find(TreeNode root, TreeNode target, int k){
34        if(root==null) return;
35        if(root==target) bfs(root,k);
36        find(root.left,target,k);
37        find(root.right,target,k);
38    }
39
40    public void bfs(TreeNode root, int k){
41        Queue<TreeNode> q= new LinkedList<>();
42        HashSet<TreeNode> set= new HashSet<>();
43         q.add(root);
44        int lvl=0;
45        while(!q.isEmpty()){
46        int size= q.size();       
47        for(int i=0;i<size;i++){
48            if(lvl==k){
49                while(!q.isEmpty()){
50            TreeNode r= q.poll();
51            ll.add(r.val);
52            }}
53            else{
54                TreeNode r= q.poll();
55                if(set.contains(r)) continue;
56                set.add(r);
57
58            for(TreeNode key:map.get(r)){
59                if(!set.contains(key)) q.add(key);
60                }
61            }
62        }
63        lvl++;
64    }
65    
66}
67}