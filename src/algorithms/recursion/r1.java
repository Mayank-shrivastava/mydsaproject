package algorithms.recursion;

public class r1 {
    public static void main(String[] args) {
        //recursive print
        //printDecreasing(5);
        //PDI(5);
        //System.out.println(fact(4));
        //System.out.println(power(2,5));
        System.out.println(nthFib(6));
    }

    public static int nthFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int fibn = nthFib(n - 1) + nthFib(n - 2);
        return fibn;
    }

    public static int power(int x, int n) {
        //base-case
        if (n == 1) return x;
        int ans = x * power(x, n - 1);
        return ans;
    }

    public static void printDecreasing(int n) {
        //base case
        if (n == 0) return;
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static int fact(int n) {
        //base-case
        if (n == 1) return 1;
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static void PDI(int n) {
        //base case
        if (n == 0) return;
        System.out.println(n);
        PDI(n - 1);
        System.out.println(n);
    }
}

