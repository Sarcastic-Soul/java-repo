/* Find Number of muntain ranges that can be formed from given pair of upstroke(/) and downstroke(\)
 * Note: At any moment number of '\' can't be more than number of '/'
 * Application of Catalan Number
 */
public class MountainRanges {
    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // mountaine ranges for i pairs
            for (int j = 0; j < i; j++) {
                int insideMtn = dp[j];
                int outsideMtn = dp[i - j - 1];
                dp[i] += insideMtn * outsideMtn;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(mountainRanges(n));
    }
}
