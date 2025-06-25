// Find maximum number of knights that can be placed in n x n chessboard
public class MaxKnights {
    static int max = -1;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // top top right
        if (row - 2 >= 0 && col + 1 < n && board[row - 2][col + 1] == 'K')
            return false;
        // top top left
        if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1] == 'K')
            return false;
        // right right top
        if (row - 1 >= 0 && col + 2 < n && board[row - 1][col + 2] == 'K')
            return false;
        // right right bottom
        if (row + 1 < n && col + 2 < n && board[row + 1][col + 2] == 'K')
            return false;
        // bottom bottom right
        if (row + 2 < n && col + 1 < n && board[row + 2][col + 1] == 'K')
            return false;
        // bottom bottom left
        if (row + 2 < n && col - 1 >= 0 && board[row + 2][col - 1] == 'K')
            return false;
        // left left bottom
        if (row + 1 < n && col - 2 >= 0 && board[row + 1][col - 2] == 'K')
            return false;
        // left left bottom
        if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2] == 'K')
            return false;

        return true;
    }

    public static void helper(char[][] board, int row, int col, int num) {
        int n = board.length;
        max = Math.max(num, max);
        if (row == n) {
            /* Run to see all the possible positions for 1 to max knights */
            // for (int i = 0; i < n; i++) {
            //     for (int j = 0; j < n; j++) {
            //         System.out.print(board[i][j]);
            //     }
            //     System.out.println();
            // }   
            // System.out.println();
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col < n - 1)
                helper(board, row, col + 1, num + 1);
            else
                helper(board, row + 1, 0, num + 1);

            board[row][col] = '.';
        }
        if (col < n - 1)
            helper(board, row, col + 1, num);
        else
            helper(board, row + 1, 0, num);

    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helper(board, 0, 0, 0);
        System.out.println("Maximum number of knights:"+max);
    }
}
