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
    public List<Integer> preorder(Node root) {
        List<Integer> ans= new ArrayList<>();
        Helper(ans,root);
        return ans;
        
    }
    void Helper(List<Integer> ans, Node root)
    {
        if(root==null)
        {
            return;
        }
        ans.add(root.val);
        for(Node c: root.children)
        {
            Helper(ans,c);
        }
    }
}