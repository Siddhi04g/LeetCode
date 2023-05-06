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
    private boolean checkMirror(TreeNode l, TreeNode r){
        //baseCase
        if(l == null && r == null)
        return true;
        if(l != null && r == null)
        return false;
        if(l == null && r != null)
        return false;
        if(l.val != r.val)
        return false;

        boolean op1 = checkMirror(l.left,r.right);
        boolean op2 = checkMirror(l.right,r.left);
        boolean finalans = op1 & op2;
        return finalans;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
        return true;
        return checkMirror(root.left,root.right);
    }
}