/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            Queue<Node> q1 = new LinkedList<>();
            for(int i=0;i<s;i++){
                Node r1=q.poll();
                if(!q.isEmpty()) r1.next=q.peek();
                else r1.next=null;
                if (r1.left != null)q1.add(r1.left);
                if (r1.right != null)q1.add(r1.right);
            }
            while(!q1.isEmpty()){
                Node f=q1.poll();
                q.add(f);
            }
        }
        return root;
        
    }
    
}