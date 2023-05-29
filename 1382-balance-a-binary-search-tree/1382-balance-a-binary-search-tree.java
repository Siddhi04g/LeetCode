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
    
    public void inorder(TreeNode root,ArrayList<Integer> arr) {
        if(root == null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
  
    public TreeNode solve(int min,int max ,ArrayList<Integer> arr) {
        if(min > max){
            return null;
        }
        int mid = min + (max - min)/2;
        TreeNode root = new TreeNode(arr.get(mid));
        root.left = solve(min,mid-1,arr);
        root.right = solve(mid + 1,max,arr);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
         Collections.sort(arr);
        TreeNode r = solve(0,arr.size()-1,arr);
        return r;
        
    }
}