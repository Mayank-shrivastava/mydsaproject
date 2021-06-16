package basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //initialization
        int ans = 0;
        while(n != 0) { //condition
            int rem = n % 10;
            ans = ans*10 + rem;
            n = n / 10; //re-initialization
        }
        System.out.println(ans);
    }
}
