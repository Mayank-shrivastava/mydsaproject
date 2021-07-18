package algorithms.backtracking;

public class QueenCombination2DKill {
    public static void main(String[] args) {
        queenCombination2DKill(new boolean[3][4], 0, 0, 3, 0, "");
    }

    public static void queenCombination2DKill(boolean[][] boxes, int row, int col, int totalQueens,
                                              int queenPlacedSoFar, String ans) {
        if (totalQueens == queenPlacedSoFar) {
            System.out.println(ans);
            return;
        }
        //manual variable change
        if (col == boxes[0].length) {
            row++;
            col = 0;
        }
        //negative base-case
        if (row == boxes.length) {
            return;
        }

        //place only if it is safe to place
        if (isSafeToPlaceTheQueen(boxes, row, col)) {
            boxes[row][col] = true;
            queenCombination2DKill(boxes, row, col + 1, totalQueens,
                    queenPlacedSoFar + 1, ans + row + col + " ");
            boxes[row][col] = false;
        }
        //not place
        queenCombination2DKill(boxes, row, col+1, totalQueens, queenPlacedSoFar, ans);

    }

    public static boolean isSafeToPlaceTheQueen(boolean[][] boxes, int row, int col) {
        //vertically up
        int r = row - 1;
        int c = col;
        while(r >= 0) {
            if(boxes[r][c]) {
                return false;

            }
            r--;
        }
        //horizontally left
        r = row;
        c = col - 1;
        while(c >= 0) {
            if(boxes[r][c]) {
                return false;

            }
            c--;
        }

        //diagonally left
        r = row - 1;
        c = col - 1;
        while(r >= 0 && c >= 0) {
            if(boxes[r][c]) {
                return false;
            }
            r--;
            c--;
        }
        //diagonally right
        r = row - 1;
        c = col + 1;
        while(r >= 0 && c < boxes[0].length) {
            if(boxes[r][c]) {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
}
