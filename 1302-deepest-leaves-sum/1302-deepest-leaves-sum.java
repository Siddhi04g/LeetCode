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
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            
            sum = 0;
            for(int i = 0 ; i < n ; i++){
                TreeNode x = q.poll();
                sum += x.val;
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
            list.add(sum);
        }
        return list.get(list.size()-1);
    }
}