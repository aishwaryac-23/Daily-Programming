import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the number to count
        System.out.print("Enter the number to count: ");
        int numberToCount = scanner.nextInt();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == numberToCount) {
                count++;
            }
        }

        // Print the result
        System.out.println("The number " + numberToCount + "
