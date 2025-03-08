import java.util.Scanner;

public class PerniciousNumber {
    public static boolean isPernicious(int n) {
        int count = Integer.bitCount(n);
        return isPrime(count);
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isPernicious(n));
    }
}
