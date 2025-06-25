import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if  (str.charAt(i)=='@') {
                System.out.println(result);
                break;
            } else {
                result += str.charAt(i);
            }
        }
        sc.close();
    }
}