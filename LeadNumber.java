import java.util.Scanner;

public class LeadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int maxFromRight = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                System.out.print(arr[i] + " ");
                maxFromRight = arr[i];
            }
        }
    }
}
