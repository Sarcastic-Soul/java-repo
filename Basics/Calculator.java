import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Remainder");
        int ans =sc.nextInt();
        switch (ans) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: System.out.println(a%b);
            break;
            default: System.out.println("Invalid Input");
        }
        sc.close();
    }
}