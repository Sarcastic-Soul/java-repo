import java.util.Scanner;

public class Recursion {
    public static void print(int x, int n,int mul) {
        if (n==0) {                           //base-1
            System.out.println(mul);
            return;
        }
        if (x==0) {                           //base-2
            System.out.println("0");
            return;
        }
        mul *= x;
        print(x, n-1,mul);
    }
 public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int x= sc.nextInt();
        int n= sc.nextInt();
        print(x,n,1);
        sc.close();
    } 
}