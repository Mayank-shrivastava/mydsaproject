package basics.pattern;

import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row; j++) {
                if(i + j >= row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
