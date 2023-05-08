/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(cloned);
        while(!q.isEmpty()){
            TreeNode x = q.poll();
            if(x.val == target.val) return x;
            else{
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);
            }
        }
        return null;
    }
}