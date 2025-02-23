import java.util.*;

public class GoldbachNumber {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static boolean isGoldbach(int n) {
        if (n <= 2 || n % 2 != 0) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isGoldbach(n));
        sc.close();
    }
}
