package basics;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the divident: ");
        int divident = scn.nextInt();
        System.out.println("Enter the divisor: ");
        int divisor = scn.nextInt();

        while(divident % divisor != 0) {
            int rem = divident % divisor;
            divident = divisor;
            divisor = rem;
        }
        System.out.println(divisor);
    }
}
