import java.util.*;
public class Stacks {
    public static void displayReverse(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        int top = st.pop();
        System.out.print(top +" ");
        displayReverse(st);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st) {
        if(st.size() ==1) {
            return;
        }
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void removeAtIdx(Stack<Integer> st, int n) {
        Stack<Integer> temp = new Stack<>();
        while(st.size()>n+1) {
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);
        System.out.println(st);
        sc.close();

        // int  n;
        // System.out.print("Enter the elements you want to insert:");
        // n = sc.nextInt();
        // for(int i=1; i<=n; i++) {
        //     int x = sc.nextInt();
        //     st.push(x);
        // }
        // System.out.println(st);

        // //Inserting elment
        // int idx = 3;
        // int x = 99;
        // Stack<Integer> temp = new Stack<>();
        // while(st.size()>idx) {
        //     temp.push(st.pop());
        // }
        // st.push(x);
        // while(temp.size()>0) {
        //     st.push(temp.pop());
        // }
        // System.out.println(st);
        
        // //Printing in array form
        // int s = st.size();
        // int[] arr = new int[s];
        // for(int i=s-1; i>=0;i--) {
        //     arr[i] = st.pop();
        // }
        // for(int i=0;i<s;i++) {
        //     System.out.print(arr[i] +" ");
        //     st.push(arr[i]);
        // }

        // System.out.println();
        // displayReverse(st);
    }
    
}
