package algorithms.backtracking;

public class NQueens {
    static int count = 0;

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        //nQueen(board, 0, 0,board.length, 0, "" );
        //nQueens2(board, 0, 0, board.length, "");
        KQueens(board, 0, 0, 3, "");
    }

    public static void nQueen(boolean[][] board, int row, int col, int totalQueens, int queensPlacedSoFar, String ans) {
        // positive base-case
        if (totalQueens == queensPlacedSoFar) {
            System.out.println(ans);
            return;
        }
        //manually change of variables
        if (col == board[0].length) {
            row = row + 1;
            col = 0;
        }
        // negative base-case
        if (row == board.length) {
            return;
        }

        //place
        if (isSafeToPlaceTheQueen(board, row, col)) {
            board[row][col] = true;
            nQueen(board, row + 1, 0, totalQueens, queensPlacedSoFar + 1, ans + row + col + " ");
            board[row][col] = false;
        }
        //not place
        nQueen(board, row, col + 1, totalQueens, queensPlacedSoFar, ans);
    }

    public static boolean isSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
        //vertically up
        int r = row - 1;
        int c = col;
        while (r >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
        }

        //horizontally left
        r = row;
        c = col - 1;
        while (c >= 0) {
            if (board[r][c]) {
                return false;
            }
            c--;
        }

        //diagonally left
        r = row - 1;
        c = col - 1;
        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        //diagonally right
        r = row - 1;
        c = col + 1;
        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static void nQueens2(boolean[][] board, int row, int queensPlacedSoFar, int totalQueens, String ans) {
        // positive base-case
        if (totalQueens == queensPlacedSoFar) {
            System.out.println(++count + ". " + ans);
            return;
        }
        // negative base-case
        if (row == board.length) {
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafeToPlaceTheQueen(board, row, col)) {
                board[row][col] = true;
                nQueens2(board, row + 1, queensPlacedSoFar + 1, totalQueens, ans + row + col + " ");
                board[row][col] = false;
            }
        }
    }

    public static void KQueens(boolean[][] board, int row, int queensPlacedSoFar, int totalQueens, String ans) {
        // positive base-case
        if (totalQueens == queensPlacedSoFar) {
            System.out.println(++count + ". " + ans);
            return;
        }
        // negative base-case
        if (row == board.length) {
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafeToPlaceTheQueen(board, row, col)) {
                board[row][col] = true;
                KQueens(board, row + 1, queensPlacedSoFar + 1, totalQueens, ans + row + col + " ");
                board[row][col] = false;
            }
        }
        // not place
        KQueens(board, row + 1, queensPlacedSoFar, totalQueens, ans);
    }
}
