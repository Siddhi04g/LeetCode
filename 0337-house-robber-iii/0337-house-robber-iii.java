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
class Pair{
    int r;int nr;
    Pair(int r, int nr){
        this.r = r;
        this.nr = nr;
    }
}
class Solution {
    public int rob(TreeNode root) {
        Pair p = findMax(root);
        return Math.max(p.r , p.nr);
    }
    public Pair findMax(TreeNode root){
        if(root == null) return new Pair(0,0);
        
        Pair l = findMax(root.left);
        Pair r = findMax(root.right);
        
        int rob = root.val + l.nr + r.nr;
        int notrob = Math.max(l.nr , l.r) + Math.max(r.nr , r.r);
        
        return new Pair(rob,notrob);
    }
}