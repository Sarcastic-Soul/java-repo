//Implementation of Stack via Linked List
public class Stacks3 {
    public static class Node{ //user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{ //user defined data structure
        private Node head = null;
        private int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        private void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val +" ");
        }
        void display(){
            displayrec(head);
            System.out.println();

        }
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }
        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(4);
        st.push(5);
        st.push(6); 
        st.push(7);
        st.push(8);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        
    }
    
}
