import java.util.Scanner;

public class TernarySearch {
    // Function to perform ternary search
    public static int ternarySearch(int[] arr, int left, int right, int key) {
        if (right >= left) {
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == key) return mid1;
            if (arr[mid2] == key) return mid2;

            if (key < arr[mid1]) {
                return ternarySearch(arr, left, mid1 - 1, key);
            } else if (key > arr[mid2]) {
                return ternarySearch(arr, mid2 + 1, right, key);
            } else {
                return ternarySearch(arr, mid1 + 1, mid2 - 1, key);
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sorted array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = ternarySearch(arr, 0, n - 1, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
