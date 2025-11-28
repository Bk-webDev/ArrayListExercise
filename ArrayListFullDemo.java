
  import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFullDemo {
    public static void main(String[] args) {

        System.out.println("\n--- FULL ARRAYLIST EXERCISE (with Iterator) ---");

        // 1. Create ArrayList
        ArrayList<String> items = new ArrayList<>();

        // 2. add() - add elements
        items.add("Laptop");
        items.add("Mouse");
        items.add("Keyboard");

        // 3. add(index, element) - insert element
        items.add(1, "Monitor");

        // 4. get()
        System.out.println("Item at index 2: " + items.get(2));

        // 5. set()
        items.set(2, "Mechanical Keyboard");

        // 6. contains()
        System.out.println("Contains Mouse? " + items.contains("Mouse"));

        // 7. indexOf()
        System.out.println("Index of Laptop: " + items.indexOf("Laptop"));

        // 8. size()
        System.out.println("Size of list: " + items.size());

        // 9. remove() - remove specific item
        items.remove("Mouse");

        // 10. removeIf() - conditional remove
        items.removeIf(item -> item.startsWith("M")); // removes Monitor

        // 11. addAll() - merge with another list
        ArrayList<String> more = new ArrayList<>();
        more.add("Camera");
        more.add("Tripod");
        items.addAll(more);

        // 12. Retrieve elements using Iterator
        System.out.println("\nRetrieve using Iterator:");
        Iterator<String> iterator = items.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 13. clear() - remove all items
        items.clear();
        System.out.println("\nList after clear(): " + items);

        // 14. isEmpty()
        System.out.println("Is list empty? " + items.isEmpty());
    }
}


