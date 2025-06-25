public class CircularLinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp.next != head) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
    }
    public static void deleteHead(Node head) {
        
    }
    
    public static void main(String[] args) {
        Node a= new Node(9);
        Node b= new Node(5);
        Node c= new Node(1);
        Node d= new Node(2);
        Node e= new Node(4);
        Node f= new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = a;
        display(a);
    }
    
}
