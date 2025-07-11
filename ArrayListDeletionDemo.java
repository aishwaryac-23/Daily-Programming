import java.util.ArrayList;

public class ArrayListDeletionDemo {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original ArrayList: " + numbers);

        // Remove by index (e.g. remove element at index 2)
        numbers.remove(2); // removes 30
        System.out.println("After removing index 2: " + numbers);

        // Remove by value (e.g. remove 40)
        numbers.remove(Integer.valueOf(40));
        System.out.println("After removing value 40: " + numbers);

        // Remove using condition (e.g. remove all even numbers)
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("After removing all even numbers: " + numbers);
    }
}
