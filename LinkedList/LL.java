class LL {
    Node head;
    private int size;

    LL() {
        this.size =0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // Add-First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // Add-Last
    public void addLast(String data) {
        Node newNode = new Node(data);
            if (head == null) {
            return;
        }
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data +"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete-First
    public void deleteFirst() {
        if(head == null) {
            System.out.println("The List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    //Delete-Last
    public void deleteLast() {
        if(head == null) {                             //Empty List
            System.out.println("The List is empty");
            return;
        }
        size--;

        if(head.next == null) {                        //Single node list
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    //Size
    public int getSize() {
        return size;
    }
    // ReverseList-Iteratation
    public void reverseIterated() {
        if(head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    //Reverse-Recursive
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("ball");
        list.addFirst("cat");
        list.addLast("apple");
        list.printList();

        System.out.println("Size of Linked list is:"+ list.getSize());

        list.head = list.reverseRecursive(list.head);
        list.printList();
        list.reverseIterated();
        list.printList();
        System.out.println(3/5);
        
    }
    
}
