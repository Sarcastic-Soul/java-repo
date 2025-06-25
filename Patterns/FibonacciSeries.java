import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n= sc.nextInt();
        System.out.println("Series");
        int a=0;
        int b=1;
        int c=0;
        for (int i=1; i<=n; i++) {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;

        }
        sc.close();
    }
}