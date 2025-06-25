import java.util.*;
/* Treemap sort the valus by in ascending order by default */
public class Treemap {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Anish", 50);
        tm.put("Ryan", 55);
        tm.put("John", 88);
        tm.put("Tom", 78);
        tm.put("Justin", 45);
        tm.put("Nina", 10);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anish", 50);
        hm.put("Ryan", 55);
        hm.put("John", 88);
        hm.put("Tom", 78);
        hm.put("Justin", 45);
        hm.put("Nina", 10);

        System.out.println(hm); // Random
        System.out.println(tm); // Sorted by key
    }
}