import java.util.Scanner;

public class CarmichaelNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isCarmichael(int n) {
        if (n < 2 || isPrime(n)) return false;
        for (int a = 2; a < n; a++) {
            if (gcd(a, n) == 1 && modExp(a, n - 1, n) != 1) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int modExp(int base, int exp, int mod) {
        int result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) result = (result * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for (int i = 2; i <= limit; i++) {
            if (isCarmichael(i)) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
