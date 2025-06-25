import java.util.Scanner;

public class Functions {
    public static void factorial(int a) { 
        if (a<0) {
            System.out.println("Invalid Number");
            return;
        }
        int mul=1;
        for(int i=1;i<=a;i++){
             mul *= i ;
        }
        System.out.println(mul);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        factorial(a);
        sc.close();
    }
}
