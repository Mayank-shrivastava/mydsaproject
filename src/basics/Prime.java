package basics;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        boolean flag = true;
        int div = 2;
        while(div <= number - 1) {
            if(number % div == 0) {
                flag = false;
            }
            div += 1;
        }
        if(flag) {
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }
    }
}
