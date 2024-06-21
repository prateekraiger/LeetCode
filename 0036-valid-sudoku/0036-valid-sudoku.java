class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !isValid(i, j, board)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValid(int row, int col, char[][] board) {
        char num = board[row][col];
        
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == num) {
                return false;
            }
        }
        
        // Check the column
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == num) {
                return false;
            }
        }
        
        // Check the 3x3 sub-box
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int r = boxRowStart + i;
                int c = boxColStart + j;
                if ((r != row || c != col) && board[r][c] == num) {
                    return false;
                }
            }
        }
        
        return true;
    }
}