public class Recursion5 {                      // Maze
    public static int countPaths(int i, int j, int n, int m) {
        if (i==n || j==m) {
            return 0; 
        }
        if (i== n-1 && j== m-1) {                  //No Left or Up Movement allowed
            return 1;
        }
        // Move Down
        int downPaths = countPaths(i+1, j, n, m);
        // Move Right
        int rightPaths = countPaths(i, j+1, n, m);

        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        int n=2;   //row                                    //Goal Coordinates
        int m=2;   //column
        int totalPaths = countPaths(0,0, n, m);
        System.out.println(totalPaths);
    }
    
}