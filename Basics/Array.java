import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();
        String numbers[] = new String[n];
        System.out.println("Enter your values");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
        }
        System.out.print("Find:"); // Linear Search
        String x = sc.next();
        for (int i = 0; i < n; i++) {
            if (numbers[i] == x) {
                System.out.println("Found at index:" + i);
            }
        }
        sc.close();
    }
}
