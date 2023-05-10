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
     int sum = 0;
    public void helper(TreeNode root, String str){
        //base case
        if(root == null) return;
        if(root.left == null && root.right == null){
            str += root.val;
            sum += Integer.parseInt(str,2);  
            return ;
        }
        
        if(root != null)
        str += root.val;
        
        helper(root.left,str);
        helper(root.right,str);
        
    }
    public int sumRootToLeaf(TreeNode root) {
        helper(root,"");
        return sum;
       
    }
}