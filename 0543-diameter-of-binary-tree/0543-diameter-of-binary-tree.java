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
 */class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] sum = new int[1];
        Helper(sum, root);
        return sum[0];
    }

    int Helper(int[] sum, TreeNode root) {
        if (root == null) 
        {
            return 0;
        }

        int left = Helper(sum, root.left);
        int right = Helper(sum, root.right);

        sum[0] = Math.max(sum[0], left + right);

        return 1 + Math.max(left, right);
    }
}
