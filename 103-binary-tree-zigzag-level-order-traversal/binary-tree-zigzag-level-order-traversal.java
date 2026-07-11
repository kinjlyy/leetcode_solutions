/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ll= new ArrayList<>();
        int t=1;
        Queue<TreeNode> q= new LinkedList<>();
        if(root== null) return ll;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list= new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode r=q.poll();
                list.add(r.val);
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);

            }
            if(t%2==0) Collections.reverse(list);
            ll.add(list);
            t++;
        }
        return ll;
        
    }
}