import java.util.*;
public class Loops{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter No. for its Table:");
        int n= sc.nextInt();
        for(int i=1; i<11; i++) {
            System.out.println(i*n);
        }
        sc.close();
    }
}