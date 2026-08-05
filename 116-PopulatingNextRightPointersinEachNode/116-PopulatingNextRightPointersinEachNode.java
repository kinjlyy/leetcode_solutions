// Last updated: 8/5/2026, 1:09:10 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root==null) return root;
27        Queue<Node> q = new LinkedList<>();
28        q.add(root);
29        while(!q.isEmpty()){
30            int s=q.size();
31            Queue<Node> q1 = new LinkedList<>();
32            for(int i=0;i<s;i++){
33                Node r1=q.poll();
34                if(!q.isEmpty()) r1.next=q.peek();
35                else r1.next=null;
36                if (r1.left != null)q1.add(r1.left);
37                if (r1.right != null)q1.add(r1.right);
38            }
39            while(!q1.isEmpty()){
40                Node f=q1.poll();
41                q.add(f);
42            }
43        }
44        return root;
45        
46    }
47    
48}