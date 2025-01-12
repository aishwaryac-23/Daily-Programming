import java.util.Scanner;

public class EquidigitalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digitCount = String.valueOf(number).length();
        int primeFactorCount = primeFactorizationLength(number);
        System.out.println(digitCount == primeFactorCount);
    }

    private static int primeFactorizationLength(int num) {
        int count = 0, divisor = 2;
        while (num > 1) {
            while (num % divisor == 0) {
                num /= divisor;
                count += String.valueOf(divisor).length();
            }
            divisor++;
        }
        return count;
    }
}
