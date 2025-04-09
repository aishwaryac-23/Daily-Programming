import java.util.Scanner;

public class SuperPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of super primes to print: ");
        int n = scanner.nextInt();
        
        int count = 0;
        int number = 2;
        int primeIndex = 0;

        while (count < n) {
            if (isPrime(number)) {
                primeIndex++;
                if (isPrime(primeIndex)) {
                    System.out.print(number + " ");
                    count++;
                }
            }
            number++;
        }

        scanner.close();
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
