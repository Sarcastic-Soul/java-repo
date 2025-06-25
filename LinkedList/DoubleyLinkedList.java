public class DoubleyLinkedList {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node head) {
        if(head == null) {
            return;
        }
        System.out.print(head.val +" ");
        display(head.next);
    }
    public static void display2(Node tail) {
        if(tail == null) {
            return;
        }
        System.out.print(tail.val +" ");
        display2(tail.prev);
    }
    public static void display3(Node random) {
        Node temp = random;
        while(temp.prev != null) {
            temp = temp.prev;
        }
        while(temp!= null) {
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtidx(Node head, int idx, int x) {
        Node s= head;
        for(int i=1; i<= idx-1; i++) {
            s= s.next;
        }
        Node r = s.next; //idx
        Node t = new Node(x);
        s.next = t;
        t.prev = s;
        t.next = r;
        r.prev = t;
        // s--t--r
    }
    public static void deleteAtidx(Node head, int idx) {
        Node temp = head;
        for(int i=0; i<idx; i++) {
            temp = temp.next; //temp is prev node idx node
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    
        public static void main(String[] args) {
            Node a= new Node(9);
            Node b= new Node(5);
            Node c= new Node(1);
            Node d= new Node(2);
            Node e= new Node(4);
            Node f= new Node(6);
            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = e;
            e.prev = d;
            e.next = f;
            f.prev = e;
            f.next = null;
            display(a);
            System.out.println();
            display2(f);
            System.out.println();
            Node newHead = insertAtHead(a,11);
            insertAtTail(newHead, 99);
            insertAtidx(newHead,3,33);
            deleteAtidx(newHead, 1);
            display(newHead);

        }
    
}
