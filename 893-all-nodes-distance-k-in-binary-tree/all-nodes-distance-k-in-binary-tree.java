/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, List<TreeNode>> map= new HashMap<>();
    List<Integer> ll= new  ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    map.put(root, new ArrayList<>());
    put(root);
    find(root, target,k);
        return ll;
    }
    public void put(TreeNode root){
    if(root==null) return;
    if(root.left!=null){
    map.put(root.left,new ArrayList<>());
    map.get(root.left).add(root);
     map.get(root).add(root.left);}
    if(root.right!=null){
    map.put(root.right,new ArrayList<>());
    map.get(root.right).add(root);
    map.get(root).add(root.right);}
    put(root.left);
    put(root.right);
    }

    public void find(TreeNode root, TreeNode target, int k){
        if(root==null) return;
        if(root==target) bfs(root,k);
        find(root.left,target,k);
        find(root.right,target,k);
    }

    public void bfs(TreeNode root, int k){
        Queue<TreeNode> q= new LinkedList<>();
        HashSet<TreeNode> set= new HashSet<>();
         q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
        int size= q.size();       
        for(int i=0;i<size;i++){
            if(lvl==k){
                while(!q.isEmpty()){
            TreeNode r= q.poll();
            ll.add(r.val);
            }}
            else{
                TreeNode r= q.poll();
                if(set.contains(r)) continue;
                set.add(r);

            for(TreeNode key:map.get(r)){
                if(!set.contains(key)) q.add(key);
                }
            }
        }
        lvl++;
    }
    
}
}