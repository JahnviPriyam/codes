class Solution {
    public int reverse(int x) {
        String s= String.valueOf(Math.abs(x));
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        try{
            int n= Integer.parseInt(sb.toString());
        return x<0? -n : n;

        }
        catch(Exception e)
        {
            return 0;
        }

    }
}
