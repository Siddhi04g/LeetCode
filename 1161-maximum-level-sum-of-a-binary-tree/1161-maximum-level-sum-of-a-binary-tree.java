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
    Queue<TreeNode> queue=new LinkedList<>();
    public int maxLevelSum(TreeNode root) {
        int maxLevel=0;
        if(root==null)
        return maxLevel;
        int sum=0;
        int level=0;
        queue.offer(root);
        int max=Integer.MIN_VALUE;
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            level++;
            sum=0;
            for(int i=0;i<levelsize;i++){
                TreeNode current=queue.poll();
                sum=sum+current.val;
                if(current.left!=null)
                queue.offer(current.left);
                if(current.right!=null)
                queue.offer(current.right);
            }
            if(sum>max){
                max=sum;
                maxLevel=level;
            }
        }
        return maxLevel;
    }
}