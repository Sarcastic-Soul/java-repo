/* Longest Common Substring
 * Find the maximum length of common substring in 2 strings
 * Substring is a contiguos sequence of characters within a string
 */
public class LCS2 {

    public static int longestCommonSubstring(String str1, String str2) { // O(n*m)
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        int ans = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }

                ans = Math.max(ans, dp[i][j]);  // Longest substring may lie in any cell of DP table
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";
        System.out.println(longestCommonSubstring(str1, str2));
    }
}
