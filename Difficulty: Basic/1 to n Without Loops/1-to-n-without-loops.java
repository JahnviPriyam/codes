class Solution {
    static void printTillN(int N) {
        // code here
        numbers(1,N);
        
        
    }
    static void numbers(int count, int N)
    {
        if(count>N)
        {
            return;
        }
        System.out.print(count+" ");
        numbers(count+1,N);
        
    }
    
}