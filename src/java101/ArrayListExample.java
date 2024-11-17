package java101;
import java.util.ArrayList;

/* The ArrayList class is a resizable array (dynamic list)
 which can be found in the java.util package
 */

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Jaque");
        names.add("Ana");
        names.add("João");
        System.out.println(names.get(0)); // Jaque
        names.remove(0); // remove Jaque
        names.remove("Jaque"); // remove Jaque
        System.out.println(names.remove(1)); // remove Ana
    }
}
