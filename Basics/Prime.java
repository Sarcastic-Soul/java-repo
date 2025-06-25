import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number Please:");
        int n = sc.nextInt();
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println("Not a Prime number");
                    break;
                } else {
                    System.out.println("Prime number");
                    break;
                }
            }
        } else if (n == 0 || n == 1) {
            System.out.println("Neither Prime nor Composite");
        } else if (n == 2) {
            System.out.println("Its an even Prime number");
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}