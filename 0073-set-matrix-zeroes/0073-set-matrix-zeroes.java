class Solution {
    public void setZeroes(int[][] matrix) {
        int n= matrix.length;
        int m= matrix[0].length;
        int[][]count= new int[n][m];
        for(int i=0; i<n; i++ )
        {
            for(int j=0; j<m; j++)
            {
                if(matrix[i][j]==0)
                {
                    for(int k=0; k<m; k++)
                    {
                        count[i][k]=1;
                    }
                    for(int k=0; k<n; k++)
                    {
                        count[k][j]=1;
                    }
                }
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(count[i][j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}