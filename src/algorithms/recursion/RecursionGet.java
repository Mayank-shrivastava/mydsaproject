package algorithms.recursion;

import java.util.ArrayList;

public class RecursionGet {
    public static void main(String[] args) {
        System.out.println(getSS("abc"));
        System.out.println(getPermutation("abc"));
        System.out.println(getBoardPath(0, 10));
        System.out.println(getMazePath(0, 0, 2, 2));
        System.out.println(getMazePathD(0, 0, 2, 2));
    }

    private static ArrayList<String> getMazePathD(int cr, int cc, int er, int ec) {
        //positive base-case
        if (cr == er && ec == cc) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        //negative base-case
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        //smaller problems recursive calls
        ArrayList<String> rrh = getMazePathD(cr, cc + 1, er, ec);
        for(String rrhs : rrh) {
            mr.add("H"+ rrhs);
        }
        ArrayList<String> rrv = getMazePathD(cr + 1, cc , er, ec);
        for(String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        ArrayList<String> rrd = getMazePathD(cr + 1, cc + 1, er, ec);
        for(String rrds : rrd) {
            mr.add("D" + rrds);
        }
        return mr;
    }


    private static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {
        //positive base-case
        if (cr == er && ec == cc) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        //negative base-case
        if (cr > er || cc > ec) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);
        ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);
        for (String rrhs : rrh) {
            mr.add("H" + rrhs);
        }
        for (String rrvs : rrv) {
            mr.add("V" + rrvs);
        }
        return mr;
    }

    private static ArrayList<String> getBoardPath(int curr, int end) {
        //positive base-case
        if (curr == end) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        //negative base-case
        if (curr > end) {
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();
        //six smaller problems
        for (int dice = 1; dice <= 6; dice++) {
            ArrayList<String> rr = getBoardPath(curr + dice, end);
            for (String rrs : rr) {
                mr.add(dice + rrs);
            }
        }
        return mr;
    }

    private static ArrayList<String> getSS(String str) {
        if (str.length() == 0) {
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char currentChar = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSS(ros);
        for (String s : recResult) {
            myResult.add(s);
            myResult.add(currentChar + s);
        }
        return myResult;
    }

    private static ArrayList<String> getPermutation(String str) {
        //base-case
        if (str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getPermutation(ros);
        ArrayList<String> mr = new ArrayList<>();
        for (String rrs : rr) {
            for (int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }
}

