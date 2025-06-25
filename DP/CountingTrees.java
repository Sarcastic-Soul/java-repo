/* Count number of BSTs that can be formed from 'n' number of nodes
 * Note: Values of nodes does not matter, count remains same for 'n' nodes 
 * Application of Catalan Number
 */
public class CountingTrees {
    public static int countTrees(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[0] = 1;

        for (int i = 2; i < n + 1; i++) {
            // 'i' nodes arranges in BST
            for (int j = 0; j < i; j++) {
                int leftSubtree = dp[j];
                int rightSubtree = dp[i - j - 1];
                dp[i] += leftSubtree * rightSubtree;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(countTrees(n));
    }
}
