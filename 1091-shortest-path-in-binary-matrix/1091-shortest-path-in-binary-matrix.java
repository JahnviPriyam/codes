class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        if (grid[0][0] == 1 || grid[r - 1][c - 1] == 1) {
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        grid[0][0] = 1;
        int[] dx= {0,0,1,-1,-1,1,-1,1};
        int[] dy= {1,-1,0,0,-1,1,1,-1};

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                int[] node = q.poll();
                if(node[0]==r-1 && node[1]==c-1) {
                    return grid[node[0]][node[1]];
                }
                for(int j=0; j<8; j++) {
                    int x= node[0] + dx[j];
                    int y= node[1] + dy[j];
                    if(x>=0 && y>=0 && x<r && y<c && grid[x][y]==0) {
                        grid[x][y] = grid[node[0]][node[1]] + 1;
                        q.add(new int[]{x,y});
                    }
                }
            }
        }
        return -1;
    }
}
