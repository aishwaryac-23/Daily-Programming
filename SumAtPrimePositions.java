import java.util.Scanner;

public class SumAtPrimePositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int position = i + 1;
            if (isPrime(position)) {
                int digit = number.charAt(i) - '0';
                sum += digit;
            }
        }

        System.out.println(sum);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
