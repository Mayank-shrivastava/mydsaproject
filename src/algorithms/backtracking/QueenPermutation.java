package algorithms.backtracking;

public class QueenPermutation {
    static int count = 0;
    public static void main(String[] args) {
        boolean[] boxes = new boolean[4];
        queenPermutation(boxes,2,0,"");

    }

    public static void queenPermutation(boolean[] boxes, int totalQueens, int queenPlacesSoFar, String ans) {
        //base-case
        if (totalQueens == queenPlacesSoFar) {
            count++;
            System.out.println(count + "." + ans);
            return;
        }

        for (int i = 0; i < boxes.length; i++) {
            if (!boxes[i]) {
                boxes[i] = true; // preparation for entering into the tunnel
                queenPermutation(boxes, totalQueens,
                        queenPlacesSoFar + 1,
                        ans + "q" + queenPlacesSoFar + "b" + i + " "); // recursive calls
                boxes[i] = false; // undo -> backtracking
            }
        }
    }
}
