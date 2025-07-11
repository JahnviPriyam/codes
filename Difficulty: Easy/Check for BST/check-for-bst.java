class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean Helper(Node root, Long min, Long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min || root.data>= max)
        {
            return false;
        }
        return Helper(root.left, min, (long)root.data)&& Helper(root.right, (long)root.data, max);
    }
    boolean isBST(Node root) {
        return Helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        // code here.
    }
}