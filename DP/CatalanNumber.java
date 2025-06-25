/* C0 = 1, C1 = 1
 * Cn = C0*C(n-1) + C1*C(n-2) + ..... + C(n-2)*C1 + C(n-1)*C0
 */

public class CatalanNumber {
    // Recursion
    public static int catalanRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRec(i) * catalanRec(n - i - 1);
        }
        return ans;
    }

    // Memoization
    public static int catalanMemo(int n, int dp[]) {
        if (n == 0 || n == 1)
            return 1;
        int ans = 0;
        if (dp[n] != -1)
            return dp[n];
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanMemo(i, dp) * catalanMemo(n - i - 1, dp);
        }
        return dp[n] = ans;
    }

    // Tabulation
    public static int catalanTab(int n) { // O(n*n)
        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(catalanRec(n));

        int dp[] = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        System.out.println(catalanMemo(n, dp));

        System.out.println(catalanTab(n));
    }
}
