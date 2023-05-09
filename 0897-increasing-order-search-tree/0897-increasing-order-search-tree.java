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
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        TreeNode n = new TreeNode(list.get(0)); 
        TreeNode r = n;
        for(int i = 1 ; i < list.size(); i++){
            TreeNode dummy = new TreeNode(list.get(i));
            n.right = dummy;
            n.left = null;
            n = dummy;
        }
        return r;
    }
}