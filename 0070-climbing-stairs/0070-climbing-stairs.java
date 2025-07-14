class Solution {
    public int climbStairs(int n) {
        if(n<4){
        return n;
        }
        else if(n>=4 && n<=5)
        {
            return n+1;
        }
        else{
            return n+2;
        }
        
    }
}