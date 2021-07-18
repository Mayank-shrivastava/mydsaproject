package algorithms.backtracking;

public class CoinPermutation {
    static int count = 0;
    public static void main(String[] args) {
        coinChangePermutation(new int[] {2,3,5,6}, 10, "");

    }

    public static void coinChangePermutation(int[] denomination, int amount, String ans) {
        if (amount == 0) {
            count++;
            System.out.println(count + ". " +ans);
            return;
        }

        for (int i = 0; i < denomination.length; i++) {
            if (amount >= denomination[i])
                coinChangePermutation(denomination, amount - denomination[i], ans + denomination[i]);
        }
    }
}
