import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isCircularPrime(num)) {
            System.out.println(num + " is a circular prime.");
        } else {
            System.out.println(num + " is not a circular prime.");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static boolean isCircularPrime(int n) {
        int digits = (int)Math.log10(n) + 1;
        int num = n;
        for (int i = 0; i < digits; i++) {
            if (!isPrime(num)) return false;
            num = rotate(num, digits);
        }
        return true;
    }

    static int rotate(int num, int digits) {
        int lastDigit = num % 10;
        num /= 10;
        return lastDigit * (int)Math.pow(10, digits - 1) + num;
    }
}
