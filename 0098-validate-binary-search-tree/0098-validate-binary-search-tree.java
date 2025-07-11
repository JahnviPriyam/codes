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
 * }  r 7 
 */
class Solution {
    public boolean Helper(TreeNode root, long min, long max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.val<=min || root.val>= max)
        {
            return false;
        }
        return Helper(root.left, min, root.val) && Helper(root.right, root.val, max);
    }
    public boolean isValidBST(TreeNode root) {
        return Helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
   
}