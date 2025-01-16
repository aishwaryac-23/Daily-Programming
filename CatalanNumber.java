import java.util.Scanner;

public class CatalanNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(catalan(n));
    }

    private static long catalan(int n) {
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * (2 * n - i) / (i + 1);
        }
        return result / (n + 1);
    }
}
