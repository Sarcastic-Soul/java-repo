import java.util.*;
public class Conditions{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int button= sc.nextInt();
        // if (button==1) {
        //   System.out.println("Hello");
        // } else if (button==2) {
        //   System.out.println("Namaste");
        // } else if (button==2) {
        //   System.out.println("Bonjour");
        // } else {
        //   System.out.println("Invalid");
        // }

        sc.close();

        switch(button) {
          case 1: System.out.println("hello");
          break;
          case 2: System.out.println("Namaste");
          break;
          case 3: System.out.println("Bonjour");
          break;
          default: System.out.println("Invalid input");
        }
        }
    }
