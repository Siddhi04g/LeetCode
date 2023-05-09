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
    private int prune(TreeNode root){
        if( root == null ) return -1;
        
        int l = prune(root.left);
        int r = prune(root.right);
        
        if(l == -1) root.left = null;
        if(r == -1) root.right = null;
        
        if(root.val == 0 && l == -1 && r == -1)
        return -1;
        return root.val;
        
        
    }
    public TreeNode pruneTree(TreeNode root) {
         int a = prune(root);
         if(root.val == 0 && root.left == null && root.right == null)
         return null;
         return root;
    }
}