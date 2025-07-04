/* Is it possible to achieve target value by adding any number from given array
 * Variation of 0-1 Knapsasck
 */
public class TargetSumSubset {
    // Tabulation
    public static boolean targetSum(int arr[], int sum) { // O(n*sum)
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];

                // include
                if (v <= j && dp[i - 1][j - v]) {
                    dp[i][j] = true;
                }
                // exclude
                else if (dp[i - 1][j]) {
                    dp[i][j] = true;
                }
            }
        }

        // DP Table
        // for(int i = 0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        return dp[n][sum];

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 7, 1, 3 };
        int sum = 10;
        System.out.println(targetSum(arr, sum));

    }
}
