import java.util.Scanner;

public class PseudoprimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (!isPrime(num) && modPower(2, num - 1, num) == 1) {
            System.out.println(num + " is a Pseudoprime to base 2.");
        } else {
            System.out.println(num + " is not a Pseudoprime to base 2.");
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static int modPower(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
