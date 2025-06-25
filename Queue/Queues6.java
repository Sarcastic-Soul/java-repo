//Reversing a Queue using Stack
import java.util.*;
public class Queues6 {
    public static void main(String[] args) {
        int k = 3;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(q.size()>0){
            helper.add(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        while(helper.size()>0){
            q.add(helper.remove());
        }
        System.out.println(q);
    }
    
}
