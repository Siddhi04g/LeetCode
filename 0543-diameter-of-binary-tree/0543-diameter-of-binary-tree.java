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
    int max = Integer.MIN_VALUE;
    private int dia (TreeNode root){
        if(root == null) return 0;
        
        int l = dia(root.left);
        int r = dia(root.right);
        
        if(1 + l + r > max)
            max = l + r;
        
        return 1 + Math.max(l,r);
        
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int a = dia(root);
        return max;
    }
}