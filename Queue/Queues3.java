//Implementation of Queue using LinkedList

public class Queues3 {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size=0;
        public void add(int x){
            Node temp = new  Node(x);
            if(size==0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }else {
                int t = head.val;
                head = head.next;
                size--;
                return t;
            }
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty!");
                return -1;
            }else{
                return head.val;
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
    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.display();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        q.display();
        System.out.println(q.remove()); 
        q.display();
        q.peek();

    }
    
}
