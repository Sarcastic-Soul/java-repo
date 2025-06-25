import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your number:");
        int n=sc.nextInt();

        System.out.print("Enter the position to manipulate:");
        int pos=sc.nextInt()-1;

        System.out.print("Set it to:");
        int oper= sc.nextInt(); 

        int bitmask= 1<<pos;
        if (oper==1) {                         // Set
            int newnumber= bitmask | n;
            System.out.println("Your new number is:"+newnumber);
        } else if (oper==0) {                 // Clear
            int newbitmask= ~(bitmask);
            int newnumber = newbitmask & n;
            System.out.println("Your new number is:"+newnumber);
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
    
}
