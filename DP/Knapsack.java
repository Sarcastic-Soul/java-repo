/* 0-1 Knapsack 
 * Find the maximum profit when a bag with fixed capacity/weight is provided with an list of items with their value and weight
 * Whole item should be incuded int bag (fraction not allowed) 
 */

public class Knapsack {
    // Memoization
    public static int knapsack(int val[], int wt[], int w, int n, int dp[][]) {// O(n*w)
        if (w == 0 || n == 0)
            return 0;

        if (dp[n][w] != -1)
            return dp[n][w];

        if (wt[n - 1] <= w) { // valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = knapsack(val, wt, w, n - 1, dp);
            return dp[n][w] = Math.max(ans1, ans2);
        } else {// not valid
            return dp[n][w] = knapsack(val, wt, w, n - 1, dp);
        }
    }

    // Tabulation
    public static int knapsackTab(int val[], int wt[], int w) {
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
                    int incProfit = value + dp[i - 1][j - weight];
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
        int val[] = { 15, 14, 1, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;
        int dp[][] = new int[val.length + 1][w + 1];
        for (int i = 0; i < val.length + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                dp[i][j] = -1;
            }
        }
        System.out.println(knapsack(val, wt, w, val.length, dp));
        System.out.println(knapsackTab(val, wt, w));
    }
}