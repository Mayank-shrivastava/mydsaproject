package algorithms.recursion;

import java.util.ArrayList;

public class GetPermutation {
    public static void main(String[] args) {
        System.out.println(getPermutation("abc"));
    }

    public static ArrayList<String> getPermutation(String str) {
        //base-case
        if(str.length() == 0) {
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rr = getPermutation(ros);
        ArrayList<String> mr = new ArrayList<>();
        for(String rrs : rr) {
            for(int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }
}
