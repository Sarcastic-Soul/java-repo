import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        q.add(0);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        while(q.isEmpty()==false){
            temp.add(q.remove());
        }
        while(temp.isEmpty()==false){
            System.out.print(temp.peek()+" ");
            q.add(temp.remove());
        }
    }
    
}
