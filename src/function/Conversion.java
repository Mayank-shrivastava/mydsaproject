package function;

public class Conversion {
    public static void main(String[] args) {
        int ans = anyBaseToDecimal(1423, 5);
        System.out.println(ans);
        int ans1 = decimalToAnyBase(238, 5);
        System.out.println(ans1);
    }


    // (1423)5 -> (?)10
    static int anyBaseToDecimal(int snum, int sbase) {
        int ans = 0;
        int i = 0;
        while(snum != 0) {
            int rem = snum % 10;
            ans = ans + rem * (int)Math.pow(sbase, i);
            snum /= 10;
            i++;
        }
        return ans;
    }

    static int decimalToAnyBase(int snum, int destbase) {
        int ans = 0;
        int multiplier = 1;
        while(snum != 0) {
            int rem = snum % destbase;
            ans = ans + (rem *multiplier);
            multiplier = multiplier * 10;
            snum /= destbase;
        }
        return ans;
    }
}

