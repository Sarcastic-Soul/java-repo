public class SudokuSolver {

    public static boolean isSafe(Character[][] board, int row, int col, char num) {
        int n = board.length;
        // COLUMN
        for (int i = 0; i < n; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        // ROW
        for (int j = 0; j < n; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }
        // GRID
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void helper(Character[][] board, int row, int col) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }

        if (board[row][col] == '.') {
            // Fill Number
            for (char i = '1'; i <= '9'; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    if (col < n - 1)
                        helper(board, row, col + 1);
                    else
                        helper(board, row + 1, 0);
                    board[row][col] = '.'; // Backtrack
                }
            }
        } else {
            if (col < n - 1)
                helper(board, row, col + 1);
            else
                helper(board, row + 1, 0);
        }

    }

    public static void main(String[] args) {
        Character[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        helper(board, 0, 0);
    }
}
