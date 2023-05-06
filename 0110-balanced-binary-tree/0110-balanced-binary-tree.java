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
    boolean ans = true;
    private int height(TreeNode root){
        //base case
        if(root == null)
            return 0;
        
        int l = height(root.left);
        int r = height(root.right);
        
        if(l == -1 || r == -1)
            return -1;
        
        if(Math.abs(l - r) > 1)
            return -1;
            
        return 1 + Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        int h = height(root);
        if(h != -1)
            return true;
        else 
            return false;
    }
}