package basics.pattern;

import java.util.Scanner;

//inverted right-angled triangle star pattern
public class P5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        for(int i = 1; i <= row; i++) {
            for(int j = 1; j <= row; j++) {
                if(j >= i && j <= row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
