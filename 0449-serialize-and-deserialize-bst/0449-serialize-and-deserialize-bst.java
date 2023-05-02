/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null)
        return "#";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                TreeNode x = q.poll();
                if(x == null){
                    sb.append("#,");
                }
                else{
                sb.append(x.val+",");
                if(x.left != null)
                q.add(x.left);
                else
                q.add(null);
                if(x.right != null)
                q.add(x.right);
                else
                q.add(null);
                }
            }
        }
        //System.out.print(sb);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<TreeNode> q = new LinkedList<>();
        String[] arr = data.split(",");
        if(arr[0].equals("#"))
        return null;
        // for(String val : arr)
        // System.out.print(val+" ");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        q.add(root);
        int i = 1;
        while(i<arr.length){
            TreeNode x = q.poll();
            if(arr[i].equals("#")){
                x.left = null;
                i++;
            }
            else{
                TreeNode temp = new TreeNode(Integer.parseInt(arr[i]));
                x.left = temp;
                q.add(temp);
                i++;
            }
            if(arr[i].equals("#")){
               x.right = null;
               i++;
            }
            else{
                TreeNode temp = new TreeNode(Integer.parseInt(arr[i]));
                x.right = temp;
                q.add(temp);
                i++;
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;