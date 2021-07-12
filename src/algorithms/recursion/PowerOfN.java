package algorithms.recursion;

public class PowerOfN {
    public static void main(String[] args) {
        System.out.println(power(3,6));
    }

    public static int power(int a, int n) {
        //in this method we will be calculating a to the power n in O(logn) complexity
        //base-case
        if(n == 0) {
            return 1;
        }
        int ans = 1;
        if(n % 2 == 0) {
            //n is even -> recursive call
            ans = power(a, n/2) * power(a, n/2);
        } else {
            ans = power(a, n/2) * power(a, n/2) * a;
        }
        return ans;
    }
}
