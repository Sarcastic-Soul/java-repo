/* Knapsack 0-1
 * Find the maximum profit when a bag with fixed capacity/weight is provided with an list of items with their value and weight
 * Whole item should be incuded in bag (fraction not allowed) 
 * Same item can be added multiple times
 */

 public class UnboundedKnapsack {

    // Tabulation
    public static int unboundedKnapsack(int val[], int wt[], int w) {
        int n = val.length;
        int dp[][] = new int[n + 1][w + 1];

        for (int i = 0; i < dp.length; i++) { // 0th col
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) { // 0th row
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                int value = val[i - 1]; // ith item val
                int weight = wt[i - 1]; // ith item wt
                if (weight <= j) {
                    int incProfit = value + dp[i][j - weight];  // Difference between Unbounded and 0-1 Knapsack
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        
        return dp[n][w];

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        
        System.out.println(unboundedKnapsack(val, wt, w));
    }
}