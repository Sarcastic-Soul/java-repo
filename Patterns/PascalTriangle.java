public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for (int i=1; i<=n; i++) {
            for (int j=n; j>=i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                sum += j;
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}