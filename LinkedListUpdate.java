import java.util.LinkedList;

public class LinkedListUpdate {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.set(1, "Mango");

        System.out.println("Updated List: " + list);
    }
}
