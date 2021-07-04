package algorithms.recursion;

import java.util.ArrayList;

public class GetSubsequences {
    public static void main(String[] args) {
        System.out.println(getSS("abc"));
    }

    public static ArrayList<String> getSS(String str) {
        if(str.length() == 0) {
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
}

