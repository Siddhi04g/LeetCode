/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root == null) return new ArrayList<>();
        
        Queue<Node> q =  new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                Node x = q.poll();
                for(int j = 0 ; j < x.children.size(); j++){
                    q.add(x.children.get(j));
                }
                l.add(x.val);
            }
            list.add(l);
        }
        return list;
    }
}