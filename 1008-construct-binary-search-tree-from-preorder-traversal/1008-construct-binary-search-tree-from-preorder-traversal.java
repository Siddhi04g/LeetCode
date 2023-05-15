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
    public TreeNode pre(int i , TreeNode root){
        if(root == null){
            root = new TreeNode(i);
            return root;
        }
        
        if(root.val > i) root.left = pre(i, root.left);
        if(root.val < i) root.right = pre(i, root.right);
        
        return root;
    }
        
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        
        for(int i : preorder){
            pre(i,root);
        }
        
        return root;
    }
}