public class FloodFill {
    // O(m*n)
    public static void helper(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgCol) {
            return;
        }
        vis[sr][sc] = true;
        if (image[sr][sc] == orgCol)
            image[sr][sc] = color;
        // left
        helper(image, sr, sc - 1, color, vis, orgCol);
        // right
        helper(image, sr, sc + 1, color, vis, orgCol);
        // up
        helper(image, sr - 1, sc, color, vis, orgCol);
        // down
        helper(image, sr + 1, sc, color, vis, orgCol);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {
        int image[][] = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 } };
        int color = 2;
        floodFill(image, 0, 0, color);

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
