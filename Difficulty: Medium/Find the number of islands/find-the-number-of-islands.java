class Solution {
    public void dfs(char[][] grid, int i, int j , int r, int c)
    {
        if(i<0 || j<0 || i==r || j==c || grid[i][j]=='W')
        {
            return;
        }
        grid[i][j]= 'W';

        dfs(grid, i-1, j, r, c);
        dfs(grid, i+1, j, r, c);
        dfs(grid, i, j-1, r, c);
        dfs(grid, i, j+1, r, c);
        dfs(grid, i-1, j-1, r, c);
        dfs(grid, i-1, j+1, r, c);
        dfs(grid, i+1, j-1, r, c);
        dfs(grid, i+1, j+1, r, c);
    }

    public int countIslands(char[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        int ans= 0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(grid[i][j]== 'L')
                {
                    dfs(grid, i, j, r, c);
                    ans++;
                }
            }
        }
        return ans;
    }
}
