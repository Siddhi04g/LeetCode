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
    StringBuilder str = new StringBuilder();
    public void tree(TreeNode root){
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            str.append(root.val);
            return;
        }

        str.append(root.val);
        str.append( "(");
        if(root.left != null) tree(root.left);
        str.append( ")");
        str.append( "(");
        if(root.right != null) tree(root.right);
        str.append( ")");
        if(str.substring((str.length() - 2),(str.length())).equals("()"))
        str.delete((str.length() - 2),(str.length()));
    }
    public String tree2str(TreeNode root) {
        tree(root);
        //StringBuilder sb = new StringBuilder(str);
        // while(sb.indexOf("()") != -1){
        //     int i = sb.indexOf("()");
        //     sb.delete(i,i+2);
        // }
        return str.toString();
        //return str;
    }
}