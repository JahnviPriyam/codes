// User function Template for Java//User function Template for Java
class Solution {
    public void func( int[]arr,  ArrayList<Integer> res, int index, int currsum)
    {
        if(index == arr.length)
        {
            res.add(currsum);
            return;
        }
        //include
        func(arr, res, index + 1, currsum + arr[index]);
        //exclude
        func(arr, res, index + 1, currsum);
        
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        func(arr,res,0,0);
        return res;
        
    }
   
}