import java.util.Scanner;
class Bitonic {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        boolean isBitonic = check(arr, n);

        if (isBitonic)
            System.out.print("Bitonic");
        else
            System.out.print("Not Bitonic");
    }

    public static boolean check(int[] arr, int n) {
        int i = 1;

        // Check for increasing sequence
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }

        // If there is no increasing part or the whole array is increasing
        if (i == 1 || i == n) {
            return false;
        }

        // Check for decreasing sequence
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }

        // If we reached the end, it's bitonic
        return i ==n;
    }
}
