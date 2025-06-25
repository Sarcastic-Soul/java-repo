/*  Number of ways to reach end point  of grid/path from starting point
Note: Person can move in all 4 Directions */

public class Mazepath4D {
    public static int maze(int sr, int sc, int er, int ec, String path, boolean[][] isVisited) {
        if (sr < 0 || sc < 0)
            return 0;
        if (sr >= er || sc >= ec)
            return 0;
        if (sr == er - 1 && sc == ec - 1) {
            System.out.println(path);
            return 1;
        }
        if (isVisited[sr][sc] == true)
            return 0;
        isVisited[sr][sc] = true;
        int rightWays = maze(sr, sc + 1, er, ec, path + "R", isVisited);
        int leftWays = maze(sr, sc - 1, er, ec, path + "L", isVisited);
        int downWays = maze(sr + 1, sc, er, ec, path + "D", isVisited);
        int upWays = maze(sr - 1, sc, er, ec, path + "U", isVisited);
        isVisited[sr][sc] = false;
        return downWays + rightWays + leftWays + upWays;
    }

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        int count = maze(0, 0, rows, cols, "", isVisited);
        System.out.println(count);
    }

}