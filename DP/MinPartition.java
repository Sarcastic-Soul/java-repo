/* Divide the array in 2 parts such the diffrence between sum of set is minimum 
 * Find the min diffrerence
 * 0-1 Knapsack Variation 
*/
public class MinPartition {

    public static int minPartition(int arr[]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        // Selecting elements for set1 such that its sum is closest to sum/2
        int W = sum / 2;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = Math.max(arr[i - 1] + dp[i - 1][j - arr[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        int sum1 = dp[n][W]; // sum of set1
        int sum2 = sum - sum1; // sum of set2;
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        int nums[] = { 1, 6, 11, 5 };
        System.out.println(minPartition(nums));
    }
}
