import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Remove by index
        numbers.remove(2);  // Removes element at index 2 (i.e., 30)
        System.out.println("After removing index 2: " + numbers);

        // Remove by value
        numbers.remove(Integer.valueOf(40));  // Removes the value 40
        System.out.println("After removing value 40: " + numbers);

        // Remove by condition: remove all even numbers
        numbers.removeIf(num -> num % 2 == 0);
        System.out.println("After removing even numbers: " + numbers);

        // Clear the list
        numbers.clear();
        System.out.println("After clearing the list: " + numbers);

        sc.close();
    }
}
