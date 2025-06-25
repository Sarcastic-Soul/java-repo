//Implementation of Dequeue using DoubleyLinkedList

public class Queues5 {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueDLL{
        Node head = null;
        Node tail = null;
        int size=0;
        public void addLast(int x){
            Node temp = new  Node(x);
            if(size==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                temp.prev = tail;
                tail=temp;
            }
            size++;
        }
        public void addFirst(int x){
            Node temp = new  Node(x);
            if(size==0){
                head = tail = temp;
            }else{
                head.prev = temp;
                temp.next = head;
                head= temp;
            }
            size++;
        }
        public int removeLast()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else {
                tail = tail.prev;
                size--;
                return tail.next.val;
            }
        }
        public int removeFirst() throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else {
                head = head.next;
                size--;
                return head.prev.val;
            }
        }
        public int peekFirst()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else{
                return head.val;
            }
        }
        public int peekLast()throws Exception{
            if(size==0){
                throw new Exception("Queue is Empty!");
            }else{
                return tail.val;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty!");
            }
            else{
                Node temp =head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        queueDLL q = new queueDLL();
        q.display();
        q.addFirst(2);
        q.addFirst(4);
        q.addFirst(6);
        q.addLast(8);
        q.addLast(10);
        q.display();
        q.removeFirst();
        q.removeLast();
        q.display();
        
    }
    
}
