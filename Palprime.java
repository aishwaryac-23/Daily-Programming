import java.util.Scanner;

public class Palprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPalindrome(num) && isPrime(num)) {
            System.out.println("Palprime");
        } else {
            System.out.println("Not a Palprime");
        }
    }

    static boolean isPalindrome(int n) {
        int rev = 0, original = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == original;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
