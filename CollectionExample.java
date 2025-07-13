import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list);

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max + ", Min: " + min);
    }
}
