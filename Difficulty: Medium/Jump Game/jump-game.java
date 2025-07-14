// User function Template for Java

class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int n= arr.length;
        int found= n-1;
        for(int i=n-2; i>=0; i--)
        {
            if(arr[i]+i>= found)
            {
                found=i;
            }
        }
        if(found==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}