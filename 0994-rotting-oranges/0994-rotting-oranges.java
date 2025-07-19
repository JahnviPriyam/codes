class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        if (fresh == 0) return 0;

        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int minutes = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            boolean turned = false;

            for (int i = 0; i < size; i++) {
                int[] node = q.poll();

                for (int[] dir : dirs) {
                    int x = node[0] + dir[0];
                    int y = node[1] + dir[1];

                    if (x >= 0 && y >= 0 && x < row && y < col && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        q.offer(new int[]{x, y});
                        fresh--;
                        turned = true;
                    }
                }
            }
            if (turned) minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}
