/* Find largest subarray with sum=0 */
import java.util.HashMap;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int arr[] = { 1, -5, 0, 5, 4, 0, -5, -9, 7, 9 };
        int n = arr.length;

        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (mp.containsKey(sum)) {
                if (max < i - mp.get(sum))
                    max = i - mp.get(sum);
            } else {
                mp.put(sum, i);
            }
        }
        System.out.println(max);
    }
}
