package algorithms.recursion;

public class RecursionPrint {
    public static void main(String[] args) {
        System.out.println("---print subsequences---");
        printSubsequence("abc", "");
        System.out.println("---print subsequence with ascii---");
        printSSWAscii("ab", "");
        System.out.println("--print permutation---");
        printPermutation("abc", "");
        System.out.println("---print board path---");
        printBoardPath(0, 10, "");
        System.out.println("---count board path---");
        System.out.println(countBoardPath(0, 10));
        System.out.println("---print Maze path---");
        printMazePath(0, 0, 2, 2, "");
        System.out.println("---count maze path---");
        System.out.println(countMazePath(0, 0, 2, 2));
        System.out.println("---print maze diagonal path---");
        printMazeDiagonalPath(0, 0, 2, 2, "");
        System.out.println("---count maze diagonal path---");
        System.out.println(countMazeDiagonalPath(0, 0, 2, 2));
    }

    private static int countMazeDiagonalPath(int cc, int cr, int ec, int er) {
        //positive base-case
        if(cc == ec && cr == er) {
            return 1;
        }
        //negative base-case
        if(cc > ec || cr > er) {
            return 0;
        }

        int ch = countMazeDiagonalPath(cc + 1, cr ,ec, er);
        int cv = countMazeDiagonalPath(cc, cr + 1, ec ,er);
        int cd = countMazeDiagonalPath(cc + 1, cr + 1, ec, er);
        return ch + cv + cd;

    }

    private static void printMazeDiagonalPath(int cc, int cr, int ec, int er, String ans) {
        //positive base-case
        if(cc == ec && cr == er) {
            System.out.println(ans);
            return;
        }
        //negative base-case
        if(cc > ec || cr > er) {
            return;
        }

        printMazeDiagonalPath(cc + 1, cr ,ec, er, ans + "H");
        printMazeDiagonalPath(cc, cr + 1, ec ,er, ans + "V");
        printMazeDiagonalPath(cc + 1, cr + 1, ec, er, ans + "D");
    }

    private static int countMazePath(int cc, int cr, int ec, int er) {
        //positive base-case
        if(cc == ec && cr == er) {
            return 1;
        }
        //negative base-case
        if(cc > ec || cr > er) {
            return 0;
        }
        int ch = countMazePath(cc + 1, cr, ec, er);
        int cv = countMazePath(cc, cr + 1, ec, er);
        return ch + cv;

    }

    private static void printMazePath(int cc, int cr, int ec, int er,String ans) {
        //positive base-case
        if(cc == ec && cr == er) {
            System.out.println(ans);
            return;
        }
        //negative base-case
        if(cc > ec || cr > er) {
            return;
        }
        //two recursive calls for horizontal move and vertical move
        printMazePath(cc + 1, cr, ec, er, ans + "H");
        printMazePath(cc, cr + 1, ec, er, ans + "V");
    }

    private static int countBoardPath(int curr, int end) {
        //positive-base case
        if(curr == end) {
            return 1;
        }
        if(curr > end) {
            return 0;
        }

        int count = 0;
        for(int dice = 1; dice <= 6; dice++) {
           count += countBoardPath(curr + dice, end);
        }
        return count;
    }

    private static void printBoardPath(int curr, int end, String ans) {
        //positive-base case
        if(curr == end) {
            System.out.println(ans);
            return;
        }
        //negative-base case
        if(curr > end) {
            return;
        }
        for(int dice = 1; dice <= 6; dice++) {
            printBoardPath(curr + dice, end ,ans + dice);
        }
    }

    private static void printPermutation(String question, String ans) {
        if (question.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < question.length(); i++) {
            char ch = question.charAt(i);
            String ros = question.substring(0, i) + question.substring(i + 1);
            printPermutation(ros, ans + ch);
        }
    }

    private static void printSSWAscii(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        char c = str.charAt(0);
        String ros = str.substring(1);
        printSSWAscii(ros, result);
        for (int i = 0; i < result.length(); i++) {
            char cc = result.charAt(i);
            int ascii = cc;
            System.out.println(ascii);
        }

        printSSWAscii(ros, result + c);
        for (int i = 0; i < (result + c).length(); i++) {
            char a = (result + c).charAt(i);
            int ascii = a;
            String res = (result + c).substring(0, i) + ascii + (result + c).substring(i + 1);
            System.out.println(res);
        }
    }


    private static void printSubsequence(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        printSubsequence(ros, result);
        printSubsequence(ros, result + ch);
    }
}
