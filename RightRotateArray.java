import java.util.Scanner;

public class RightRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        int last = array[n - 1];
        for (int i = n - 1; i > 0; i--) array[i] = array[i - 1];
        array[0] = last;
        for (int num : array) System.out.print(num + " ");
    }
}
