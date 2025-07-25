/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        while(root!= null)
        {
            if(n1.data<root.data&& n2.data<root.data)
            {
                root= root.left;
            }
            else if(n1.data> root.data && n2.data> root.data)
            {
                root= root.right;
            }
            else
            {
                break;
            }
        }
        return root;
    }
}