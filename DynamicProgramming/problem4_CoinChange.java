import java.util.Arrays;

public class problem4_CoinChange {
    public static int minCoin(int[] arr, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); 
        dp[0] = 0; 

        for (int coin : arr) {
            for (int j = coin; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(minCoin(coins, amount)); 
}
}