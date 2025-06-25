/*Note: Performance:- HashSet > LinkedHashSet 
LinkedHashSet maintains the order of insertion*/

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();

        // Add elements
        st.add("James");
        st.add("Bond");
        st.add("James");
        st.add("Micheal");
        st.add("Jackson");

        System.out.println(st); // print set

        System.out.println(st.contains("Micheal") ? "Found" : "Not Found"); // check an element

        System.out.println("Size of Set: " + st.size()); // size of set

        st.remove("James"); // remove element
        System.out.println(st);

        st.add("Charlie");

        // Iterate over elements with for loop
        for (String s : st) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Iterate over elements with Iterator object
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }

}
