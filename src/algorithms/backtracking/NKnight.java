package algorithms.backtracking;

public class NKnight {
    static int count = 0;
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        nKnight(board, 0, 0, board.length, 0, "");

    }

    public static void nKnight(boolean[][] board, int row, int col, int totalKnights, int knightsPlacedSoFar, String ans) {
        // positive base-case
        if (totalKnights == knightsPlacedSoFar) {
            System.out.println(++count + ". " + ans);
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
        if (isSafeToPlaceTheKnight(board, row, col)) {
            board[row][col] = true;
            nKnight(board, row , col+1, totalKnights, knightsPlacedSoFar + 1, ans + row + col + " ");
            board[row][col] = false;
        }
        //not place
        nKnight(board, row, col + 1, totalKnights, knightsPlacedSoFar, ans);
    }

    private static boolean isSafeToPlaceTheKnight(boolean[][] board, int row, int col) {
        int[] rowArr = {-1, -2, -2, -1};
        int[] colArr = {2, 1, -1, -2};
        for(int i = 0; i<4; i++) {
            int r = row + rowArr[i];
            int c = col + colArr[i];
            //boundary check
            if(r >=0 && r < board.length && c >= 0 && c < board[0].length) {
                if(board[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
}
