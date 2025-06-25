/*  Number of ways to reach end point  of grid/path from starting point
Constraint: Person can move left or right only */
public class Mazepath {
    public static int maze(int sr, int sc, int er, int ec, String path) {
        if (sr > er || sc > ec)
            return 0;
        if (sr == er && sc == ec) {
            System.out.println(path);
            return 1;
        }

        int downWays = maze(sr + 1, sc, er, ec, path + "D");
        int rightWays = maze(sr, sc + 1, er, ec, path + "R");
        return downWays + rightWays;
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        int count = maze(1, 1, rows, cols, "");
        System.out.println(count);

    }
}
