import java.math.BigInteger;
import java.util.Scanner;

public class StormerNumber {
    public static boolean isStormer(int n) {
        int k = n * n + 1;
        int largestPrimeFactor = 1;
        for (int i = 2; i * i <= k; i++) {
            while (k % i == 0) {
                largestPrimeFactor = i;
                k /= i;
            }
        }
        if (k > 1) {
            largestPrimeFactor = k;
        }
        return largestPrimeFactor >= 2 * n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isStormer(n));
    }
}
