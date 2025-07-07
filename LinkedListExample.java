import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List: " + list);
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.remove("Banana");

        System.out.println("After removal: " + list);
    }
}
