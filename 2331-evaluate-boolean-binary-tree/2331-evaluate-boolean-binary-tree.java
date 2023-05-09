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
    private int evalTree(TreeNode root){
        if (root == null) return -1;
        
        int l = evalTree(root.left);
        int r = evalTree(root.right);
        
        if(root.val == 2){
            if(l == 1 || r == 1 ) root.val = 1;
            else root.val = 0;
        }
        else if(root.val == 3){
            if(l == 1 && r == 1) root.val = 1;
            else root.val = 0;
        }
        
        return root.val;
    }
    public boolean evaluateTree(TreeNode root) {
        int a = evalTree(root);
        if(a == 0 ) return false;
        return true;
    }
}