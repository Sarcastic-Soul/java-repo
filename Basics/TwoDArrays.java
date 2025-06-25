import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("Number of rows:");
         int rows =sc.nextInt();
         System.out.print("Number of Column:");
         int column=sc.nextInt();

         int[][] numbers = new int [rows][column];

         for (int i=0; i<rows; i++) {                 //INPUT
            for(int j=0; j<column; j++) {
                 numbers[i][j] = sc.nextInt();
            }
         }
         System.out.println("Your 2D Array:");      //OUTPUT
         for (int i=0; i<rows; i++) {
            for (int j=0; j<column; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
         }
         System.out.println("Find:");              //SEARCHING...
         int x= sc.nextInt();
         for (int i=0; i<rows; i++) {
            for (int j=0; j<column; j++) {
                if (numbers[i][j]==x) {
                    System.out.println("Its coordinates are ("+ (i+1) +","+ (j+1) +")");
                }
            }
         }

         sc.close();
    }
    
}
