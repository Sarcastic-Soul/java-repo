//Implementation of Stack via Arrays
public class Stacks2 {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if(isFull()) {
                System.out.println("Stack is Full!!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            idx--;
            int top = arr[idx];
            arr[idx] = 0;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++) {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        st.push(9);
        st.push(10);
    }
    
}
