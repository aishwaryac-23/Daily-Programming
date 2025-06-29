import java.util.Scanner;

public class NumberPositionFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the number to search
        System.out.print("Enter the number to find its position(s): ");
        int target = scanner.nextInt();

        boolean found = false;
        System.out.print("The number " + target + " is found at position(s): ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.print((i + 1) + " ");  // 1-based position
                found = true;
            }
        }

        if (!found) {
            System.out.println("Not found in the array.");
        }
    }
}
