class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        int sum=0;
        for(int i=n-1; i>=0; i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newnum = new int[n+1];
        newnum[0]=1;
        return newnum;

        
    }
}