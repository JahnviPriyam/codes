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
    public TreeNode Helper(int[] nums, int left, int right)
    {
        if(left>right)
        {
            return null;
        }
        int mid= (left+right)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left= Helper(nums, left, mid-1 );
        node.right=Helper(nums, mid + 1, right );
        return node;
    
    

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int n= nums.length;
        return Helper(nums, 0, n-1); //sorted array, starting index, ending index

        
    }
}