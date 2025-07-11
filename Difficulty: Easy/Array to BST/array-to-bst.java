// User function Template for Java

class Solution {
    public Node Helper(int[] nums, int left, int right)
    {
        if(left>right)
        {
            return null;
        }
        int mid= (left+right)/2;
        Node node= new Node(nums[mid]);
        node.left= Helper(nums, left, mid-1);
        node.right= Helper(nums, mid+1, right);
        return node;
    }
    public Node sortedArrayToBST(int[] nums) {
        // Code here
        int n= nums.length;
        return Helper(nums, 0, n-1);
        
    }
}