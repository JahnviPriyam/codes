class Solution {
    public int dfs(int[][] grid, int i, int j , int r, int c)
    {
        if(i<0 || j<0 || i==r || j==c || grid[i][j]==0)
        {
            return 0;
        }
        grid[i][j]= 0;
        int area = 1;

        area += dfs(grid, i-1, j, r, c);
        area += dfs(grid, i+1, j, r, c);
        area += dfs(grid, i, j-1, r, c);
        area += dfs(grid, i, j+1, r, c);

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int r= grid.length;
        int c= grid[0].length;
        int maxArea= 0;
        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c; j++)
            {
                if(grid[i][j]== 1)
                {
                    int area = dfs(grid, i, j, r, c);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
