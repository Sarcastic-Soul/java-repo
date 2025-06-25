/* A person can climb 1 or 2 stair at a time 
 * In how many ways can he reach nth stair
 */

public class ClimbingStairs {
    // Memoization
    public static int countWays(int n, int ways[]) { // O(n)
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if (ways[n] != 0)
            return ways[n];
        return ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
    }

    // Tabulation
    public static int countWaysTable(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        System.out.println("Number of ways: " + countWays(n, ways));
        System.out.println("Number of ways: " + countWaysTable(n));
    }
}
