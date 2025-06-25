// import LL.Node;
public class LL2 {
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data +" ");
            head = head.next;
        }
    }
    public static int length(Node head) {
        int count = 0;
        while(head != null) {
            count++;
            head =head.next;
        }
        return count;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(8);
        Node d = new Node(19);
        a.next = b;
        b.next = c;
        c.next =d;
        // LL2.display(a);
        System.out.println(LL2.length(a));
    }
}