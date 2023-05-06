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
//bfs solution
class Solution1 {
    Queue<TreeNode> queue=new LinkedList<>();
    public int maxDepth(TreeNode root) {
        int maxdepth=0;
        if(root==null)
        return maxdepth;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            maxdepth++;
            for(int i=0;i<levelsize;i++){
                TreeNode current=queue.poll();
                if(current.left!=null)
                queue.offer(current.left);
                if(current.right!=null)
                queue.offer(current.right);
            }
        }
        return maxdepth;
    }
}

//dfs solution
class Solution {
    public int maxDepth(TreeNode root) {
        //baseCase
        if(root == null)
            return 0;
        
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        
        int finalans = 1 + Math.max(l,r);
        return finalans;
    }
}