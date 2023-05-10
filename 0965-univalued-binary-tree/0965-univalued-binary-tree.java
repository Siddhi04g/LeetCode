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
    public int univalue(TreeNode root, int t){
        if(root == null) return t;
        
        int l = univalue(root.left, t);
        int r = univalue(root.right, t);
        if(l != t || r != t) ans = false;
        return root.val;
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        int a = root.val;
        int i = univalue(root, a);
        return ans;
    }
}