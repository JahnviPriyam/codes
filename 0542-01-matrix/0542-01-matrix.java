class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int one = 0;
        int zero = 0;
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    zero++;
                    q.add(new int[]{i, j});
                } else {
                    one++;
                    mat[i][j] = -1;
                }
            }
        }

        if (one == 0) return mat;

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        while (!q.isEmpty()) {
            int min = 0;
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] node = q.poll();

                for (int j = 0; j < 4; j++) {
                    int x = node[0] + dx[j];
                    int y = node[1] + dy[j];

                    if (x >= 0 && y >= 0 && x < row && y < col && mat[x][y] == -1) {
                        if ((mat[x][y] = 1 + mat[node[0]][node[1]]) != 0) {
                            q.add(new int[]{x, y});
                        }
                    }
                }
            }
            if (!q.isEmpty()) min++;
        }
        return mat;
    }
}
