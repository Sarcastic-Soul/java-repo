import java.util.Scanner;

public class Recursion2 {                           // Time Complexity= log(n) with base 2
    public static int calcPower(int x, int n) {
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        if (n%2 ==0) {
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else {
            return calcPower(x, n/2) * calcPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt() ;
        int ans = calcPower(x, n);
        System.out.println(ans);
        sc.close();
    }
}
