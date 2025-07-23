import java.util.*;

public class AchillesNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isAchillesNumber(number)) {
            System.out.println("Achilles number");
        } else {
            System.out.println("Not an Achilles number");
        }
        scanner.close();
    }
    static boolean isAchillesNumber(int n) {
        if (!isPowerful(n) || isPerfectPower(n)) return false;
        return true;
    }

    static boolean isPowerful(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count == 1) return false;
        }
        return n == 1 || n > 1;
    }

    static boolean isPerfectPower(int n) {
        for (int base = 2; base <= Math.sqrt(n); base++) {
            int power = base;
            while (power <= n / base) {
                power *= base;
                if (power == n) return true;
            }
        }
        return false;
    }
}
