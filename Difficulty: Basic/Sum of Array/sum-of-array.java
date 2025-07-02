// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        // code here
        return sum(arr, arr.length);
        
    }
    int sum(int arr[], int n)
    {
        if(n<=0)
        {
            return 0;
        }
        return sum(arr, n-1)+ arr[n-1];
    }
}
