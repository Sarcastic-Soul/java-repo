import java.util.*;

public class LL1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("a");              //add is same as addLast
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) +"->");
        }
        System.out.println("null");

        list.remove(3);
        System.out.println(list);
    }
    
}
