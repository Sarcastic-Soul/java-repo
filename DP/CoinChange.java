/* Given a list of  coin, find number of ways to return target/change value
 * Amount of coins are infinite
 * Unbounded Knapsack
 */

public class CoinChange {
    // Tabulation
    public static int coinChangeWays(int coins[], int target) {
        int n = coins.length;
        int dp[][] = new int[n + 1][target + 1];

        for (int i = 0; i < dp.length; i++) { // 0th col
            dp[i][0] = 1;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < target + 1; j++) {
                if (coins[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j]; // TotalWays = includeWays + excludeWays
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // for (int i = 0; i < dp.length; i++) {
        //     for (int j = 0; j < dp[0].length; j++) {
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return dp[n][target];

    }

    public static void main(String[] args) {
        int coins[] = { 2,5,3,6};
        int target = 10;
        System.out.println(coinChangeWays(coins, target));
    }
}
