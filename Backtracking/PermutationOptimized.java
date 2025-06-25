import java.util.ArrayList;
import java.util.List;

public class PermutationOptimized {

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void permutate(int[] nums, int idx, List<List<Integer>> ans) {
        int n = nums.length;
        if (idx == n - 1) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }
        for (int i = idx; i < n; i++) {
            swap(i, idx, nums);
            permutate(nums, idx + 1, ans);
            swap(i, idx, nums);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();
        permutate(nums, 0, ans);
        System.out.println(String.valueOf(ans));
        System.out.println(String.format("Number of Permutations: %d",ans.size()));
    }
}