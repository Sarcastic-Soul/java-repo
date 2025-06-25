public class HollowButterfly {
    public static void main(String[] args) {
        int n=5;
        for (int i=1; i<=n; i++) {
            for(int j=1;j<=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=(n-i)*2;j>=1; j--) {
               System.out.print(" ");
            }
            for(int j=1;j<=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  
        }
        for (int i=n; i>=1; i--) {
            for(int j=1;j<=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" ");
                }
            }
            for(int j=(n-i)*2;j>=1; j--) {
                System.out.print(" ");
             }
             for(int j=1;j<=i; j++) {
                 if (i==j || j==1) {
                     System.out.print("*"); 
                 } else {
                     System.out.print(" ");
                 }
             }
            System.out.println();  
        }
    }
    
}
