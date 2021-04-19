package practiceassignment;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //char ch = scn.next().charAt(0);
        char ch;
        do {
            ch = scn.next().charAt(0);
            if(ch == '+') {
                long n1 = scn.nextLong();
                long n2 = scn.nextLong();
                System.out.println(n1 + n2);
            } else if(ch == '-') {
                long n1 = scn.nextLong();
                long n2 = scn.nextLong();
                System.out.println(n1 - n2);
            } else if(ch == '*') {
                long n1 = scn.nextLong();
                long n2 = scn.nextLong();
                System.out.println(n1 * n2);
            } else if(ch == '/') {
                long n1 = scn.nextLong();
                long n2 = scn.nextLong();
                System.out.println(n1 / n2);
            } else if(ch == 'X' || ch == 'x') {
                break;
            } else {
                System.out.println("Invalid operation. Try again");
            }
            ch = scn.next().charAt(0);
        } while(ch != '\0');
        //System.out.println("Invalid operation. Try again");
    }
}
