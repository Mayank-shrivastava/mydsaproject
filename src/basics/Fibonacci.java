package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //given the value n print the values from zeroth fibonacci to nth fibonacci
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int counter = 1;
        while(counter <= n + 1) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
            counter++;
        }
    }
}
