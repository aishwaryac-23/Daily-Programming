import java.util.Scanner;

public class SemiPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isSemiPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                int otherFactor = num / i;
                if (isPrime(i) && isPrime(otherFactor)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isSemiPrime(number)) {
            System.out.println(number + " is a semi-prime number.");
        } else {
            System.out.println(number + " is not a semi-prime number.");
        }
        scanner.close();
    }
}
