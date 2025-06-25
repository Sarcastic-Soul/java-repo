public class TowerOfHanoi {
    public static void helper(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer Disk " + n + " from " + src + " to " + dest);
            return;
        }
        helper(n - 1, src, dest, helper);
        System.out.println(" Transfer Disk " + n + " from " + src + " to " + dest);
        helper(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 5;
        helper(n, "S", "H", "D");
    }
}
