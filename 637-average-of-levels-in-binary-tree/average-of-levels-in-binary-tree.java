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
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode> q= new LinkedList<>();
        List<Double> arr = new ArrayList<>();
        if(root==null) return arr;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            double sum=0;
            for(int i=0;i<s;i++){
                TreeNode nn=q.poll();
                sum+=nn.val;
                if(nn.left!=null) q.add(nn.left);
                if(nn.right!=null)q.add(nn.right);
            }
            arr.add(sum/s);
        }
        return arr;
        
    }
}