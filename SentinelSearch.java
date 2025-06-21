import java.util.Scanner;

public class SentinelSearch {
    public static int sentinelSearch(int[] arr, int n, int key) {
        int last = arr[n - 1];
        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;

        if (i < n - 1 || arr[n - 1] == key)
            return i;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int key = sc.nextInt();
        int result = sentinelSearch(arr, n, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
