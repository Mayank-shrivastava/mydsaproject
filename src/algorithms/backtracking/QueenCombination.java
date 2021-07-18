package algorithms.backtracking;

public class QueenCombination {
    static int count = 0;

    public static void main(String[] args) {
        queenCombination(new boolean[4], 2, 0, "", -1);
        System.out.println("---------------------------------");
        queenCombinationBoxRespect(new boolean[4], 0, 2, 0, "");
        System.out.println("---------------------------------");
        queenCombinationBoxRespect2D(new boolean[2][2], 0, 0, 2, 0, "");
        System.out.println("---------------------------------");
        queenCombinationBoxRespect2DExtraRecCall(new boolean[2][2],0,0,2,0,"");
    }

    //queen combination wrt queens
    public static void queenCombination(boolean[] boxes, int totalQueens, int queenPlacedSoFar, String ans, int lastBoxUsed) {
        if (totalQueens == queenPlacedSoFar) {
            count++;
            System.out.println(count + ". " + ans);
            return;
        }

        for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
            boxes[i] = true;
            queenCombination(boxes, totalQueens,
                    queenPlacedSoFar + 1, ans + "q" + queenPlacedSoFar + "b" + i + " ",
                    i);
            boxes[i] = false;
        }
    }

    //queen combination wrt boxes
    public static void queenCombinationBoxRespect(boolean[] boxes, int col, int totalQueens, int queensPlacedSoFar, String ans) {
        // positive base-case
        if (totalQueens == queensPlacedSoFar) {
            System.out.println(ans);
            return;
        }
        // negative base-case
        if (col == boxes.length) {
            return;
        }
        // place
        boxes[col] = true;
        queenCombinationBoxRespect(boxes, col + 1, totalQueens, queensPlacedSoFar + 1, ans + "b" + col);
        boxes[col] = false; // undo work

        //not-place
        queenCombinationBoxRespect(boxes, col + 1, totalQueens, queensPlacedSoFar, ans);
    }

    public static void queenCombinationBoxRespect2D(boolean[][] boxes,
                                                    int row, int col, int totalQueens, int queenPlacedSoFar, String ans) {

        // We can solve this problem by two ways:-
        //          1.By manual variable change
        //          2.By extra recursive call

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

        //place
        boxes[row][col] = true;
        queenCombinationBoxRespect2D(boxes, row, col + 1, totalQueens, queenPlacedSoFar + 1, ans + row + col + " ");
        boxes[row][col] = false;

        //not placed
        queenCombinationBoxRespect2D(boxes, row, col + 1, totalQueens, queenPlacedSoFar, ans);

    }

    //extra recursive call approach
    public static void queenCombinationBoxRespect2DExtraRecCall(boolean[][] boxes,
                                                                int row, int col,
                                                                int totalQueens, int queenPlacedSoFar, String ans) {

        // We can solve this problem by two ways:-
        //          1.By manual variable change
        //          2.By extra recursive call

        if (totalQueens == queenPlacedSoFar) {
            System.out.println(ans);
            return;
        }

        //extra recursive calls
        if(col == boxes[0].length) {
            queenCombinationBoxRespect2DExtraRecCall(boxes,row+1,0, totalQueens, queenPlacedSoFar,ans);
            return;
        }

        //negative base-case
        if (row == boxes.length) {
            return;
        }

        //place
        boxes[row][col] = true;
        queenCombinationBoxRespect2DExtraRecCall(boxes, row, col + 1, totalQueens, queenPlacedSoFar + 1, ans + row + col + " ");
        boxes[row][col] = false;

        //not placed
        queenCombinationBoxRespect2DExtraRecCall(boxes, row, col + 1, totalQueens, queenPlacedSoFar, ans);

    }
}
