public class SphenicNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static boolean isSphenic(int n) {
        int count = 0;
        int product = 1;

        for (int i = 2; i <= n && count < 3; i++) {
            if (n % i == 0 && isPrime(i)) {
                count++;
                product *= i;
                n /= i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        return count == 3 && n == 1;
    }

    public static void main(String[] args) {
        int number = 30;

        if (isSphenic(number)) {
            System.out.println(number + " is a Sphenic number.");
        } else {
            System.out.println(number + " is not a Sphenic number.");
        }
    }
}
/*
A Sphenic Number is a positive integer that is the product of exactly three distinct prime numbers. To check if a number is a Sphenic number, you need to ensure:

It has exactly three distinct prime factors.
Each of these factors is prime.

30 is a Sphenic number.

 */