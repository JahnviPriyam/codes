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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();
        getLeaves(root1, list1);
        getLeaves(root2, list2);
        return list1.equals(list2);


        
    }
    public void getLeaves(TreeNode root, List<Integer> list)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            list.add(root.val);
        }
        getLeaves(root.left, list);
        getLeaves(root.right, list);
    }
}