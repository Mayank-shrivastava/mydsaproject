package algorithms.backtracking;

public class CoinCombination {
    public static void main(String[] args) {
        int[] denomination = {2,3,5,6};
        coinChange(denomination, 10, "",0);
        coinChangeWrtCoin(denomination, 0,10,"");
    }

    public static void coinChangeWrtCoin(int[] denomination, int vidx, int amount, String ans) {
        // positive base-case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }
        // negative base-case
        if(amount < 0 || vidx == denomination.length) {
            return;
        }
        // yes
        coinChangeWrtCoin(denomination, vidx, amount-denomination[vidx], ans+denomination[vidx]);
        // no
        coinChangeWrtCoin(denomination, vidx+1, amount, ans);
    }

    public static void coinChange(int[] denomination, int amount, String ans, int lastDenominationIdx) {
        //base-case
        if(amount == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = lastDenominationIdx; i < denomination.length; i++) {
            if(amount >= denomination[i])
                coinChange(denomination,amount-denomination[i],ans+denomination[i],i);
        }
    }
}
