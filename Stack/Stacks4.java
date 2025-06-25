import java.util.*;
public class Stacks4{
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()==0) return false;
                st.pop();
            }
        }
        if(st.size()>0) return false;
        else return  true;
    }
    //Simpler way to day same thing..
    // public static boolean isBalanced(String str) {
    //     int counter=0;
    //     for(int i=0; i<str.length();i++) {
    //         char ch = str.charAt(i);
    //         if(ch=='(') counter++;
    //         if(ch==')') counter--;
    //         if(counter <0) return false;
    //     }
    //     if(counter ==0) return true;
    //     else return false;

    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
        sc.close();
    }
}
