package basics.pattern;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n;
        int row = 1;
        while(row <= n) {
            int cst = 1;
            while(cst <= nst) {
                System.out.print("*");
                cst++;
            }
            System.out.println();
            nst--;
            row++;
        }
    }
}
