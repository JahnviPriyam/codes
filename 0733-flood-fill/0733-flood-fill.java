class Solution {
    public void dfs(int[][] image, int i, int j, int r, int c, int oldColor, int newColor) {
        if (i < 0 || j < 0 || i >= r || j >= c || image[i][j] != oldColor || image[i][j] == newColor) {
            return;
        }

        image[i][j] = newColor;

        dfs(image, i + 1, j, r, c, oldColor, newColor);
        dfs(image, i - 1, j, r, c, oldColor, newColor);
        dfs(image, i, j + 1, r, c, oldColor, newColor);
        dfs(image, i, j - 1, r, c, oldColor, newColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int r = image.length;
        int c = image[0].length;
        int oldColor = image[sr][sc];
        dfs(image, sr, sc, r, c, oldColor, newColor);
        return image;
    }
}
