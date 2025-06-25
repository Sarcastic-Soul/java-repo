import java.util.*;

/*LinkedHashMap stored the key-value pair in the same order as inserted */
public class Linkedmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lm = new LinkedHashMap<>();
        lm.put("Anish", 50);
        lm.put("Ryan", 55);
        lm.put("John", 88);
        lm.put("Tom", 78);
        lm.put("Justin", 45);
        lm.put("Nina", 10);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anish", 50);
        hm.put("Ryan", 55);
        hm.put("John", 88);
        hm.put("Tom", 78);
        hm.put("Justin", 45);
        hm.put("Nina", 10);

        System.out.println(hm); // Random
        System.out.println(lm); // Same order as inserted
    }
}
