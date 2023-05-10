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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int s = 0;
        while(!q.isEmpty()){
            int n = q.size();
            
            int dir = q.peek().val;
            for(int i = 0 ; i < n ; i ++){
                TreeNode x = q.poll();
                if(s%2 == 0){
                    
                    if(x.val %2 == 0) return false;
                    if(i != 0){
                       if(dir < x.val) 
                          dir = x.val;
                       else return false;
                    }
                        
                }else{
                    if(x.val %2 != 0) return false;
                    
                    if(i != 0){
                       if(dir > x.val) 
                          dir = x.val;
                       else return false;
                    }
                }
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);
            }
            s++;
        }
        return true;
    }
}