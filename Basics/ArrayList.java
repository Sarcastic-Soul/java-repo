import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<Integer>();

        //add elements
        list.add(1);
        list.add(2);
        list.add(4);

        list.add(2,3);   //add in between
        System.out.println(list);

        // get elements
        int a= list.get(0);
        System.out.println("element at 0 index is:"+a);

        //change element
        list.set(0, 0);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int b = list.size();
        System.out.println("size of given list:"+b);

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
    
}